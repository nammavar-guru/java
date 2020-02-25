package com.example.core.Static.priv;


public class Child extends Parent{
	public Child() {
		System.out.println("Child Constructor");
	}
	private void m2() {
		System.out.println("child");
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.m2();
		Parent p = new Parent();
		//p.m2();
		Parent p1 = new Child();
		//p1.m2();

	}

}
