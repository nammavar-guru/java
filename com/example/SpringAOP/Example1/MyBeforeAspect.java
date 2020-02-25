package com.example.SpringAOP.Example1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyBeforeAspect {
	
	@Before("execution (* com.example.SpringAOP.Example1.SimpleCalculator.*(..))")
	public void myAdvise(JoinPoint jp) {
		System.out.println("Before Method runs");
	}
}
