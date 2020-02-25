package com.example.pattern.creational.Prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		Customer c2 = (Customer)c1.clone();
		Customer c3 = (Customer)c1.deepClone();
		
		System.out.println("c1.equals(c2)"+c1.equals(c2));
		System.out.println("c1.equals(c3)"+c1.equals(c3));
		
		System.out.println("(c1==c2)"+(c1==c2));
		System.out.println("(c1==c3)"+(c1==c3));
		
		String s1="guru";
		String s2=s1;
		
		System.out.println("(s1==s2)"+(s1==s2));
		System.out.println("s1.equals(s2)"+s1.equals(s2));
	}

}
