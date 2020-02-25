package com.example.core.oops.poly.overriding;

public class C extends P{
	
	public void method() throws Exception{
		System.out.println("Class C - Method()");
	}
	
	public void methodA() {
		System.out.println("Class C - MethodA()");
	}
	
	public C methodCovariant() {
		System.out.println("Class P - methodCovariant()");
		C c = new C();
		return c;
	}
	public static void main(String[] args) throws Exception {
		P p = new P();
		p.method();
		
		C c = new C();
		c.method();
		
		P pa = new C();
		pa.method();
		//pa.methodA();
		
		C ch = (C)new P();
		ch.methodA();
	}

}
