package com.example.SpringCore.testBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		//FirstBean fb = (FirstBean) context.getBean("firstBean");
		//FirstBean fb1 = (FirstBean) context.getBean("firstBeanz");
		
	}
}
