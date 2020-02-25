package com.example.SpringAOP.Example1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		SimpleCalculator calculator = context.getBean(SimpleCalculator.class);
		calculator.add(1, 2);
	}
}
