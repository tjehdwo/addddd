package com.kh.springdb.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="Menus")
public class Menu {
	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="menus_seq")
	@SequenceGenerator(name="menus_seq", sequenceName="menus_seq",allocationSize=1)
	private Long id;
	
	private String name;
	
	private String description;
	
	private String price;
	
	private String isSoldout;
	
	
}
