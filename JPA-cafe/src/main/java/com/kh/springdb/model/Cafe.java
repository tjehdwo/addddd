package com.kh.springdb.model;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Cafe {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cafes_seq")
	@SequenceGenerator(name="cafes_seq",sequenceName="cafes_seq",allocationSize=1)
	
	private Long id;
	
	private String cafename;
	
	private String address;
	

	

}
