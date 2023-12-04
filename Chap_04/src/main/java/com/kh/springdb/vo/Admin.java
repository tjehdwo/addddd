package com.kh.springdb.vo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="Admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="Admin_id_sequence")
	@SequenceGenerator(name="Admin_id_sequence",sequenceName="Admin_id_sequence",allocationSize=1)
	private int Admin_id;
	private String Admin_password;
}
