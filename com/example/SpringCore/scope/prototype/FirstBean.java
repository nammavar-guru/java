package com.example.SpringCore.scope.prototype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class FirstBean {
	SecondBean secondBean;
	
	public FirstBean() {
		System.out.println("First bean");
	}
	
	@Autowired
	public void setSecondBean(SecondBean secondBean) {
		this.secondBean = secondBean;
	}
	
	
}
