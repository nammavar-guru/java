package com.example.SpringCore.InitDestroymethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
	@Bean(initMethod="init",destroyMethod="destroy")
	public DatabaseInitializer databaseInitializer() {
		return new DatabaseInitializer();
	}
	
//	@Bean(initMethod="init",destroyMethod="destroy")
//	public DatabaseInitializer2 databaseInitializer2() {
//		return new DatabaseInitializer2();
//	}
}
