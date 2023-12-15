package com.kh.springdb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kh.springdb.model.Cafe;
import com.kh.springdb.repository.CafeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CafeService {
	private final CafeRepository cafeRepository;
	
	public List<Cafe> viewAllCafe(){
		return cafeRepository.findAll();
	}
	
	public Cafe viewCafeById(Long id) {
		return cafeRepository.findCafeById(id);
	}
	
	public Cafe saveCafe(Cafe cafe) {
		return cafeRepository.save(cafe);
	}
}
