package com.example.SpringBoot.SpringDataJpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringBoot.SpringDataJpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,String> {

}
