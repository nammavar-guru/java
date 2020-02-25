package com.example.SpringCore.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyBeforeAspect {
	@Pointcut("execution (* com.example.SpringCore.test.SimpleCalculator.*(..))")
	public void pointcutName() {
		
	}
	
	@Before("execution (* com.example.SpringAOP.Example1.SimpleCalculator.*(..))")
	public void myAdvise(JoinPoint jp) {
		System.out.println("Before Method runs");
	}
}
