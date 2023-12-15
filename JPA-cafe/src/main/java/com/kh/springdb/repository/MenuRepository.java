package com.kh.springdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kh.springdb.model.Menu;

public interface MenuRepository extends JpaRepository <Menu,Long>{

	Menu findMenuById(int id);
}
