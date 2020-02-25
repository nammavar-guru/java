package com.example.SpringCore.ConstructorInjection.circularDependencySetter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class A {
	B secondBean;
	
	@Autowired
	public void setB(B secondBean) {
		this.secondBean = secondBean;
	}
	
	public A() {
		System.out.println("First bean - Second Bean");
	}

	public String test() {
		System.out.println("Class A - Test");
		return "Class A - Test";
	}
}
