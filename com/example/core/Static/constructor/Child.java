package com.example.core.Static.constructor;


public class Child extends Parent{
	public Child() {
		System.out.println("Child Constructor");
	}
	public static void m2() {
		System.out.println("child");
	}

	public static void main(String[] args) {
		m2();
		Child c = new Child();
		c.m2();
		Parent p = new Child();
		p.m2();
		System.out.println("Main method");

	}

}
