package com.example.SpringCore.scope.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("After Context initialization completes");
		FirstBean firstBean = context.getBean(FirstBean.class);
		System.out.println("Prototype bean calling again ****");
		FirstBean fb1 = context.getBean(FirstBean.class);
		FirstBean fb2 = context.getBean(FirstBean.class);
		FirstBean fb3 = context.getBean(FirstBean.class);
	}
}
/** Output :
After Context initialization completes
First bean
Second Bean Constructor
Prototype bean calling again ****
First bean
Second Bean Constructor
First bean
Second Bean Constructor
First bean
Second Bean Constructor
**/