package com.example.SpringDataJpa.Hibernate.OneToOne.Example2.PK.FK;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Data;

@Data

@Entity
public class BookDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Integer id;
	int numberOfPages;
	
	@OneToOne
	@JoinColumn
	@MapsId
	private Books books;

	public BookDetail(int numberOfPages) {
		super();
		this.numberOfPages = numberOfPages;
	}
	
	
}
