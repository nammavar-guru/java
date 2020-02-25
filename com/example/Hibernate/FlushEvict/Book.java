package com.example.Hibernate.FlushEvict;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	
	
	
}
