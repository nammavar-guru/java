package com.example.SpringCore.importclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		context.close();
	}

}
