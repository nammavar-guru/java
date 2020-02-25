package com.example.core.Static.mehodhiding;


public class Child extends Parent{
	public static void m2() {
		System.out.println("child");
	}

	public static void main(String[] args) {
		m2();
		Child c = new Child();
		c.m2();
		Parent p = new Child();
		p.m2(); // Based on reference type, it will resolve the method. it is called method hiding
		System.out.println("Main method");

	}

}
