package com.example.SpringCore.scope.MultiBeanPrototypeSingleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		FirstBean fb1 = context.getBean(FirstBean.class);
		FirstBean fb2 = context.getBean(FirstBean.class);
		FirstBean fb3 = context.getBean(FirstBean.class);
		
	}
}
/** Output:
 * Second Bean Constructor
 * 
 * 
 * */
