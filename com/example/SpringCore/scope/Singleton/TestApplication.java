package com.example.SpringCore.scope.Singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("After Context initialization completes");
		FirstBean firstBean = context.getBean(FirstBean.class);
	}
}
