package com.kh.springdb.vo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="customer_id_sequence")
	@SequenceGenerator(name="customer_id_sequence", sequenceName="customer_sequence", allocationSize=1)
	@Column(name="customer_id")
	private Long customer_id;
	private String customer_nickName;
	private String customer_password;
	private String customer_email;

}
