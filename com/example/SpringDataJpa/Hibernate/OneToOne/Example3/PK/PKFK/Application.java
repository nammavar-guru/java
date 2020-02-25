package com.example.SpringDataJpa.Hibernate.OneToOne.Example3.PK.PKFK;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@SpringBootApplication
public class Application implements CommandLineRunner {
	private final EmployeesRepository repository;
	private final PhonesRepository prepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
	
	public void run(String... args) {
		Employees emp = new Employees();
		emp.setName("guru");
		emp.setAge(40);
		
		Phones phone = new Phones();
		phone.setPhoneNumber("9840416525");
		phone.setEmployees(emp);
		//emp.setPhones(phone);
		repository.save(emp);
		prepository.save(phone);
	}
}
