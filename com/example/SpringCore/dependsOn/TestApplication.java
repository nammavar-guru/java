package com.example.SpringCore.dependsOn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		//A a = context.getBean(A.class);
	}

}
