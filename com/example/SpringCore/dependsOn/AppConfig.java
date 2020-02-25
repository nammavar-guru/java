package com.example.SpringCore.dependsOn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

//@DependsOn Beans need to be instantiated first before instantiating the actual bean
@Configuration
public class AppConfig {

	@Bean("A")
	@DependsOn(value= {"B","C"})
	public A  a() {
		return new A();
	}
	
	@Bean("B")
	public B b() {
		return new B();
	}
	
	@Bean("C")
	public C c() {
		return new C();
	}
}
