package com.kh.spring.shop.vo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Payments")
@Getter @Setter
public class Payment {
	//데이터 베이스에 주문 정보를 저장하기 위한 클래스
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "PaymentId_Seq")
	@SequenceGenerator(name="PaymentId_Seq",sequenceName="PaymentId_Seq", allocationSize=1)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Order order;
	private String paymentStatus;
}