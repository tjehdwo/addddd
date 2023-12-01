package com.kh.spring.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.kh.spring.shop.vo.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}