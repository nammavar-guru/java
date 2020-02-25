package com.example.SpringAOP.Example1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.example.SpringAOP.Example1")
@EnableAspectJAutoProxy
public class AppConfig {
	
}
