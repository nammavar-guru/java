package com.example.SpringAOP.Example2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		SimpleCalculator calculator = context.getBean(SimpleCalculator.class);
		calculator.add(1, 9);
	}
}
