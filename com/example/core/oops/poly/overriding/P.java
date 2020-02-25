package com.example.core.oops.poly.overriding;



public class P {
	
	public void method() throws Exception {
		System.out.println("Class P - Method()");
	}
	
	public P methodCovariant() {
		System.out.println("Class P - methodCovariant()");
		P p = new P();
		return p;
	}
	

}
