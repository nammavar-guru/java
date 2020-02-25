package com.example.core.collection.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

class Employee  {
	String name;
	Integer employeeId;
	Integer salary;
	Date joiningDate;
	
	public Employee(String name, Integer employeeId, Integer salary, Date joiningDate) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + ", salary=" + salary + ", joiningDate="
				+ joiningDate + "]";
	}
	
	
	
}

class EmployeeComparator implements Comparator<Employe> {
	public int compare(Employe e1, Employe e2) {
		int compareName = e1.name.compareTo(e2.name);
		int compareSalary = e1.salary.compareTo(e2.salary);
		int compareJoingDate = e1.joiningDate.compareTo(e2.joiningDate);
		int compareEmployeeId=e1.employeeId.compareTo(e2.employeeId);	
		int result;
		
		if(compareName == 0) {
			if(compareSalary==0) {
				if(compareJoingDate == 0 )
					result = compareEmployeeId;
				else
					result = compareJoingDate;
			}else {
				result = compareSalary;
			}
		} else {
			result = compareName;
		}		
		
		return result;
	
	}
	
}
public class ComparatorExample {

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
        
        Collections.sort(l, new EmployeeComparator());
        
        l.forEach(la->{ System.out.println(la +"" );});
        //Collections.sort(l, Collections.reverseOrder(new EmployeeComparator()));
        Collections.sort(l, new EmployeeComparator().reversed());
        
        System.out.println("REverse Order:");
        l.forEach(la->{ System.out.println(la +"" );});
	}

}
