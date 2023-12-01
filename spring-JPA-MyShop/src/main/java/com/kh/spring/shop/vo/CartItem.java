package com.kh.spring.shop.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItem {
	private Product product;
	private int quantity;
	
	public CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

}
