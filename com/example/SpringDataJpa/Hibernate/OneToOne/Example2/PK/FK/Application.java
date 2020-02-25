package com.example.SpringDataJpa.Hibernate.OneToOne.Example2.PK.FK;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@SpringBootApplication
public class Application implements CommandLineRunner {
	private final BooksRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
	
	public void run(String... args) {
		repository.save(new Books("Books 1", new BookDetail(100)));
		repository.save(new Books("Books 2", new BookDetail(10)));
		
	}
}
