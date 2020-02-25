package com.example.Hibernate.HibernateState;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Student {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	
	public Student() {}
	
	public Student(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
}
