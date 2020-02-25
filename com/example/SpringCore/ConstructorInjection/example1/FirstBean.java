package com.example.SpringCore.ConstructorInjection.example1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_SINGLETON)
public class FirstBean {
	public FirstBean() {
		System.out.println("First bean");
	}
	
	
	public FirstBean( SecondBean secondBean) {
		System.out.println("First bean - Second Bean");
		secondBean.testSingletonAlongWithPrototype();
	}
	
}
