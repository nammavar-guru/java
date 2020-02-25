package com.example.core.oops.poly.overriding.methodoverriding;

public class Child extends Parent{

	//Static method in parent class can not be overridden non-static method in  child class
//	public  void methodA() {
//		System.out.println("Parent Static  methodA called");
//	}
	
	
	//Non-Static method in parent class can not be overridden static method in child class.
//	public static void methodB() {
//		System.out.println("Parent non-Static  methodB called");
//	}
	
	//Static method in Parent class can be overridden static method in child class.
	public static void methodA() {
		System.out.println("child Static  methodA called");
	}
	
	//Non-static method in Parent class can be overridden non-static method in child class.
	public  void methodB() {
		System.out.println("Child non-Static  methodB called");
	}
	
	//non-final method in Parent class can be overridden final method in child class.
	public final  void methodC() {
		System.out.println("child non- Final  methodC called");
	}
	
	//Private method can be overridden in Child class. Private method in Parent class is not visible to child class
	 private  void methodD() {
		System.out.println("child private methodD called");
	}
	
	//Private method can be overridden in Child class. Private method in Parent class is not visible to child class
	 public  void methodE() {
		System.out.println("child public  methodE called");
	}

}
