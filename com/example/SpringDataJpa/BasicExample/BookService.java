package com.example.SpringDataJpa.BasicExample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> bookList(){
		return bookRepository.findAll();	
	}
	
	public void saveBook(Book book){
		 bookRepository.save(book);	
	}
	
}
