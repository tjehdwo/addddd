package com.kh.springdb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.springdb.model.Cafe;
import com.kh.springdb.service.CafeService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class CafeController {
	
	private final CafeService cafeService;
	
	
	@GetMapping("/cafe/list")
	public String viewAllCafe(Model model) {
		model.addAttribute("cafes", cafeService.viewAllCafe());
		return "cafe_list";
	}
	
	@GetMapping("/cafe/new")
	public String saveCafe(Model model) {
		model.addAttribute("cafe", new Cafe());
		return "cafeForm";
	}
	
	@PostMapping("/cafe/new")
	public String saveNewCafe(Cafe cafe) {
		cafeService.saveCafe(cafe);
		return "redirect:/cafe/list";
	}
	
	@GetMapping("/cafe/detail/{id}")
	public String CafeDetail(@PathVariable("id") Long id,Model model) {
		Cafe cafe = cafeService.viewCafeById(id);
		model.addAttribute("cafe",cafe);
		return "cafe_detail";
	}
	
	
}
