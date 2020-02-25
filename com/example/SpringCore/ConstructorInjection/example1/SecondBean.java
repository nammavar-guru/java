package com.example.SpringCore.ConstructorInjection.example1;

import org.springframework.stereotype.Component;

@Component
public class SecondBean {
	public SecondBean() {
		System.out.println("Second Bean Constructor");
	}
	
	public void testSingletonAlongWithPrototype() {
		System.out.println("Testing Singleton Along with prototype");
	}
}
