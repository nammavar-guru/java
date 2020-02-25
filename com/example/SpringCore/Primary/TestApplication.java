package com.example.SpringCore.Primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		ConstructorBasedInjection cbi = context.getBean(ConstructorBasedInjection.class);
		cbi.processMessage("test");
	}

}
