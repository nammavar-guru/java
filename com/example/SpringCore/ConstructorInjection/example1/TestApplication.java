package com.example.SpringCore.ConstructorInjection.example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
