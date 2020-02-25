package com.example.core.oops.poly.overriding.methodoverriding;

public class Parent {

	
	public static void methodA() {
		System.out.println("Parent Static  methodA called");
	}
	
	public void methodB() {
		System.out.println("Parent non-Static  methodB called");
	}
	
	public void methodC() {
		System.out.println("Parent Final  methodC called");
	}
	
	private void methodD() {
		System.out.println("Parent private  methodD called");
	}
	
	private void methodE() {
		System.out.println("Parent private  methodE called");
	}
}
