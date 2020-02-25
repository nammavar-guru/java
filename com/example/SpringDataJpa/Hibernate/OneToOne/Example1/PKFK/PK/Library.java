package com.example.SpringDataJpa.Hibernate.OneToOne.Example1.PKFK.PK;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Data

@Entity
public class Library {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(unique = true)
	Address address;

	public Library(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	
	
}
