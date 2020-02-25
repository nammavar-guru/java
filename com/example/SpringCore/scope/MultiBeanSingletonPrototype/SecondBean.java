package com.example.SpringCore.scope.MultiBeanSingletonPrototype;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SecondBean {
	public SecondBean() {
		System.out.println("Second Bean Constructor");
	}
	
	public void testSingletonAlongWithPrototype() {
		System.out.println("Testing Singleton Along with prototype");
	}
}
