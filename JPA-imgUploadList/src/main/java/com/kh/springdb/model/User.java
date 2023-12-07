package com.kh.springdb.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.*;
/*
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity*/
public class User {
/*	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="user_seq")
	@SequenceGenerator(name="user_seq", sequenceName="user_seq",allocationSize=1)
	private int id;
	
	private String password;
	private String name;
	private String email;
	private String address;
	private String phone;
	private String role;
	
	private int coin;
	
	//판매자가 가지고 있는 상품
	private List<Item> items = new ArrayList<>();
	
	//판매자가 판매한 내역
	//@OneToMany(mappedBy="seller")
	//private List<Sale> sellerSale;
	
	//판매자가 판매한 상품들 SaleItem을 만든 후 주석 해지
	//@OneToMany(mappedBy="seller")
	//private List<SaleItem> sellerSaleItem = new ArrayList<>();
	
	//구매자 결제 내역
	
	//구매자 주문 리스트
	
	//구매자가 사고싶은 내역의 장바구니*/
	
}
