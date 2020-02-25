package com.example.SpringCore.ConstructorInjection.circularDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class A {
	/*
	 * public A() { System.out.println("First bean"); }
	 */
	
	public A(B secondBean) {
		System.out.println("First bean - Second Bean");
	}
	
}
