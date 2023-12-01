package com.kh.spring.shop.vo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Member")
@Getter
@Setter
public class Member {
	@Id
	@Column(name="member_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="memberId_Seq")
	@SequenceGenerator(name= "memberId_Seq", sequenceName="memberId_Seq",allocationSize=1)
	private Long id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	private String address;
}
