package com.example.core.Static.constructor;

class Parent {
	public Parent() {
		System.out.println("Parent Constructor");
	}
	
	public static void m2() {
		System.out.println("Parent");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m2();
		System.out.println("Parent main method");
	}
}