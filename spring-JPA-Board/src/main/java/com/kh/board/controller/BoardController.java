package com.kh.board.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.board.service.BoardService;
import com.kh.board.vo.Board;


@Controller
@RequestMapping("/boards")
public class BoardController {
	
	private final BoardService boardService;
	
	@Autowired
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@GetMapping
	public String getAllBoards(Model model) {
		List<Board> boards = boardService.getAllBoards();
		model.addAttribute("boards",boards);
		return "boardList";
	}
	
	@GetMapping("/detail/{board_id}")
	public String getBoardDetails(@PathVariable Long board_id,Model model) {
		Optional<Board> board = boardService.getBoardById(board_id);
		board.ifPresent(value -> model.addAttribute("board",value));
		return "boardDetail";
	}
	
	@GetMapping("/new")
	public String displayBoardForm(Model model) {
		model.addAttribute("board",new Board());
		return "boardForm";
	}
	@PostMapping("/save")
	public String saveBoard(@ModelAttribute Board board) {
		boardService.saveBoard(board);
		return "redirect:/boards";
	}
	
	//수정하기
	@GetMapping("/update/{board_id}")
	public String getUpadteBoard(@PathVariable Long board_id,Model model) {
		Optional<Board> board = boardService.getBoardById(board_id);
		board.ifPresent(value -> model.addAttribute("board",value));
		return "boardForm";	
	}
	
	//삭제하기
	@GetMapping("/delete/{board_id}")
	public String deleteBoard(@PathVariable Long board_id) {
		boardService.deleteBoardById(board_id);
		return "redirect:/boards";

	}
	//모두 삭제하기
	@GetMapping("/delete/all")
	public String deleteAllBoards() {
		boardService.deleteAllBoards();
		return "redirect:/boards";
	}
}
