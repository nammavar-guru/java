package com.example.pattern.structural.proxy;

public class RealObjectProxy extends RealObjectImpl{
	
	public void doSomething() {
		System.out.println("Delegating real object");
		super.doSomething();
	}
}
