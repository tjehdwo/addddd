package com.kh.springdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kh.springdb.model.Cafe;

public interface CafeRepository extends JpaRepository <Cafe,Long>{
	Cafe findCafeById(Long id);
}
