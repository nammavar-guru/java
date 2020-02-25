package com.example.SpringCore.testBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.example.SpringCore.testBean")
public class AppConfig {
	@Bean("firstBean")
	//@Scope("prototype")
	public FirstBean firstBean() {
		return new FirstBean();
	}
	
	@Bean("firstBeanz")
	//@Scope("prototype")
	public FirstBean firstBeanA() {
		return new FirstBean();
	}
}
