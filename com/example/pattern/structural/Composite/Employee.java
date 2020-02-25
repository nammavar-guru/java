package com.example.pattern.structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	String name;
	String dept;
	List<Employee> subordinates;
	
	public Employee(String name, String dept) {
		this.name= name;
		this.dept=dept;
		subordinates = new ArrayList<>();
	}
	
	public void add(Employee e) {
		subordinates.add(e);
	}
	
	public void remove(Employee e) {
		subordinates.remove(e);
	}
	
	public List<Employee> getSubordinates(){
		return subordinates;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + "]";
	}
	
	
}
