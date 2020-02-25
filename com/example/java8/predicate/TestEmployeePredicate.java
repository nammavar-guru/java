package com.example.java8.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee{
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
public class TestEmployeePredicate {

	public static void main(String args[]) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Guru",150000));
		list.add(new Employee("testa",2001));
		list.add(new Employee("testb",300000));
		list.add(new Employee("testc",80000));
		list.add(new Employee("testd",120000));
		
		Predicate<Employee> p1 = e1->e1.getSalary()>80001;
		Predicate<Employee> p2 = e1->e1.getSalary()%2==0;
		
		System.out.println("IF Condition AND");
		for(Employee e1:list) {
			if(p1.and(p2).test(e1)) {
				System.out.println("Name:"+e1.getName()+" Salay :"+e1.getSalary());
			}
		}
		
		System.out.println("IF Condition OR");
		for(Employee e1:list) {
			if(p1.or(p2).test(e1)) {
				System.out.println("Name:"+e1.getName()+" Salay :"+e1.getSalary());
			}
		}
	}
}
