package com.example.SpringBoot.SpringDataJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.SpringDataJpa.dao.EmployeeRepository;
import com.example.SpringBoot.SpringDataJpa.model.Employee;
import com.example.SpringBoot.SpringDataJpa.model.Response;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;
	
	@PostMapping("/EmployeeService/employee")
	public Response addEmployee(@RequestBody Employee employee) {
		repository.save(employee);
		return new Response(employee.getId()+" inserted",Boolean.TRUE);
	}
	
	@GetMapping("/EmployeeService/employees")
	public Response getAllEmployee() {
		List<Employee> employees = repository.findAll();
		return new Response("record Counts"+employees.size(),Boolean.TRUE);
	}
}
