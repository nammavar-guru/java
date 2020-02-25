package com.example.SpringAOP.AroundAdvice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.SpringAOP.AroundAdvice")
@EnableAspectJAutoProxy
public class AppConfig {
	
}
