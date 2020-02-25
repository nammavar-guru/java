package com.example.SpringCore.Lazy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {

	@Bean("A")
	public A  a() {
		return new A();
	}
	
	@Bean("B")
	@Lazy
	public B b() {
		return new B();
	}
	
	
}
