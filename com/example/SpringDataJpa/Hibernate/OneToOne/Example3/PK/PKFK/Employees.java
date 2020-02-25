package com.example.SpringDataJpa.Hibernate.OneToOne.Example3.PK.PKFK;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Setter
@Getter
@Entity
public class Employees {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	int age;
	String name;
	@OneToOne(mappedBy="employees")
	Phones phones;
	
	
}
