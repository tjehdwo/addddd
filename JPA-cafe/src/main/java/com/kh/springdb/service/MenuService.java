package com.kh.springdb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kh.springdb.model.Menu;
import com.kh.springdb.repository.MenuRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor //(@Autowired 한 번에 만들어주는 어노테이션)
public class MenuService {
	private final MenuRepository menuRepository;

	//전체 메뉴 조회
	public List<Menu> allMenuView(){
		return menuRepository.findAll();
	}
	
	public Menu getMenuById(int id) {
		return menuRepository.findMenuById(id);
	}
	
	public Menu saveMenu(Menu menu) {
		return menuRepository.save(menu);
	}
}
