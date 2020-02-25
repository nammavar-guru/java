package com.example.java8.function;

import java.util.*;
import java.util.function.*;


class Employee{
	
	int empNo;
	String empname;
	
	public Employee(int empNo, String empname) {
		super();
		this.empNo = empNo;
		this.empname = empname;
	}
}
public class BiFunctionExample {

	public static void main(String[] args) {
		BiFunction<Integer,String,Employee> bi= (a,b)-> new Employee(a,b);
		List<Employee> li = new ArrayList<Employee>();
		li.add(bi.apply(123, "Guru"));
		li.add(bi.apply(133, "kumaresh"));
		li.add(bi.apply(143, "Nikhil"));
		
		for(Employee el:li) {
			System.out.println("Employee Number "+el.empNo);
			System.out.println("Employee Name "+el.empname);
			System.out.println();
		}
	}

}
