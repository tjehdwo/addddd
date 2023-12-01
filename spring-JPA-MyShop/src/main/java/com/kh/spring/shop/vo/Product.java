package com.kh.spring.shop.vo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="ProductList")
@Getter
@Setter
public class Product {
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="productId_Seq")
	@SequenceGenerator(name= "productId_Seq", sequenceName="prouctId_Seq",allocationSize=1)
	
	private Long id;
	
	private String name;
	
	private String category;
	
	private String price;
	
	private String stock_quantity;
	
	private String description;
}