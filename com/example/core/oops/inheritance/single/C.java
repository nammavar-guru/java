package com.example.core.oops.inheritance.single;

public class C extends P {
public void m2() {
	System.out.println("Class C - Method M2");
}

public static void main(String args[]) {
	P p = new C();
	//C p = (C) new P();
	p.m1();
	//p.m2();
	// method resolution are taken care by compiler based on reference type
}
}
