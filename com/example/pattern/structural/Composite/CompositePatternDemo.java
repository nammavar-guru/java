package com.example.pattern.structural.Composite;

public class CompositePatternDemo {

	public static void main(String[] args) {
		
		Employee ceo = new Employee("a","CEO");
		Employee headSales = new Employee("Robert","HeadSales");
		Employee headMarketing = new Employee("Bob","HeadMarketing");
		Employee clerk1 = new Employee("Laura","clerk");
		Employee clerk2 = new Employee("James","clerk");
		Employee salesExecutive1 = new Employee("sam","salesExecutive");
		Employee salesExecutive2 = new Employee("saraha","salesExecutive");
		ceo.add(headSales);
		ceo.add(headMarketing);
		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);
		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		headMarketing = new Employee("test","HeadMarketing");
		
		System.out.println("CEO"+ceo);
		System.out.println("HeadSales"+headSales);
		System.out.println("HeadMarketing"+headMarketing);
	}

}
