package com.example.SpringDataJpa.Hibernate.OneToOne.Example1.PKFK.PK;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String street;
	private String zipCode;
	
	@OneToOne(mappedBy="address")
	Library library;

	public Address(String street, String zipCode) {
		super();
		this.street = street;
		this.zipCode = zipCode;
	}
	
	
	
}
