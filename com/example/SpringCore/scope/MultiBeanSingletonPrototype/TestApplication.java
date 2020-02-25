package com.example.SpringCore.scope.MultiBeanSingletonPrototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
	}
}

/** Output:
First bean
Second Bean Constructor
**/