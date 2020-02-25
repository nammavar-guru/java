package com.example.SpringCore.ConstructorInjection.circularDependency;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class B {
	/*
	 * public B() { System.out.println("Second Bean Constructor"); }
	 */
	
	public B(A a) {
		System.out.println("Second Bean Constructor with First Bean");
	}
	public void testSingletonAlongWithPrototype() {
		System.out.println("Testing Singleton Along with prototype");
	}
}
