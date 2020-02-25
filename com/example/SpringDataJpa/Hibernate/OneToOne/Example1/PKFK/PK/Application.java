package com.example.SpringDataJpa.Hibernate.OneToOne.Example1.PKFK.PK;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@SpringBootApplication
public class Application implements CommandLineRunner {
	private final LibraryRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
	
	public void run(String... args) {
		repository.save(new Library("Library 1", new Address("Thakkolam","631151")));
		repository.save(new Library("Library 2", new Address("Chennai","600097")));
		
	}
}
