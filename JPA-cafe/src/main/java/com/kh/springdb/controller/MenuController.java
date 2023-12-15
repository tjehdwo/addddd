package com.kh.springdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.springdb.model.Menu;
import com.kh.springdb.service.MenuService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MenuController {
	private final MenuService menuService;
	
	//메인페이지
	@GetMapping("/")
	public String mainPageView() {
		return "index";
	}
	
	//새로운 메뉴 추가
	@GetMapping("/menu/new")
	public String menuSaveForm(Model model) {
		model.addAttribute("menu",new Menu());
		return "addMenuForm";
	}
	
	@PostMapping("/menu/new")
	public String menuAddForm(Menu menu) {
		menuService.saveMenu(menu);
		return "redirect:/";
	}
	
	//상품 클릭했을 때 상세보기
	@GetMapping("/menu/detail/{id}")
	public String menuDetail(@PathVariable("id") int id, Model model) {
		Menu menu = menuService.getMenuById(id);
		model.addAttribute("menu",menu);
		return "menu_detail";
	}

}
