package com.example.core.collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class Employe  {
	String name;
	Integer employeeId;
	Integer salary;
	Date joiningDate;
	
	public Employe(String name, Integer employeeId, Integer salary, Date joiningDate) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}
	
	

	public String getName() {
		return name;
	}



	public Integer getEmployeeId() {
		return employeeId;
	}



	public Integer getSalary() {
		return salary;
	}



	public Date getJoiningDate() {
		return joiningDate;
	}



	@Override
	public String toString() {
		return "Employee [name=" + name +  ", salary=" + salary + ", joiningDate="
				+ joiningDate + ", employeeId=" + employeeId + "]";
	}
	
	
	
}


public class ComparatorExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employe emp1 = new Employe("ank",14, 2000, new Date(2016 - 1900, 11, 14));
        Employe emp2 = new Employe("dav",15, 500, new Date(2016 - 1900, 11, 23));
        Employe emp3 = new Employe("ank",10, 1000, new Date(2016 - 1900, 11, 22));
        Employe emp4 = new Employe("sam",8, 9000, new Date(2016 - 1900, 11, 29));
        Employe emp5 = new Employe("ank", 9, 1000, new Date(2016 - 1900, 11, 19));

        List<Employe> l = new ArrayList<Employe>();
        l.add(emp1);
        l.add(emp2);
        l.add(emp3);
        l.add(emp4);
        l.add(emp5);
        
        Comparator<Employe> nameComparator = (a,b)-> a.getName().compareTo(b.getName());
        
         
  
        Collections.sort(l,nameComparator);
        l.forEach(System.out::println);
        
        System.out.println("\n");
        
        Collections.sort(l, Comparator.comparing(Employe::getName)
        								.thenComparing(Employe::getSalary)
        								.thenComparing(Employe::getJoiningDate));
        
        l.forEach(la->{ System.out.println(la +"" );});

        Collections.sort(l, Comparator.comparing(Employe::getName)
        							  .thenComparing(Employe::getSalary)
        							  .thenComparing(Employe::getJoiningDate)
        							  .reversed());
        
        System.out.println("REverse Order:");
        l.forEach(la->{ System.out.println(la +"" );});
	}

}
