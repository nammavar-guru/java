package com.example.SpringDataJpa.Hibernate.OneToOne.Example2.PK.FK;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	
	@OneToOne(mappedBy="books",cascade=CascadeType.ALL)
	private BookDetail bookDetail;

	public Books(String name, BookDetail bookDetail) {
		super();
		this.name = name;
		this.bookDetail = bookDetail;
		this.bookDetail.setBooks(this);
	}
	
	
}
