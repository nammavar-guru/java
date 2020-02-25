package com.example.SpringCore.ConstructorInjection.circularDependencySetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class B {
	A a;
	
	@Autowired
	public void setA(A a) {
		this.a = a;
	}

	public B() {
		System.out.println("Second Bean Constructor with First Bean");
	}
	
	public void testSingletonAlongWithPrototype() {
		System.out.println("Testing Singleton Along with prototype");
	}
	
	public String test() {
		System.out.println("Class B - Test");
		return "Constructor B - Test";
	}
}
