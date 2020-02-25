package com.example.SpringAOP.AroundAdvice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAroundAspect {
	
	//@Around("execution (* com.example.SpringAOP.AroundAdvice.SimpleCalculator.*(..))")
	//@Around("execution (* add(..))")
	//@Around("execution (* com.example..*.*(..))")
	//@Around("execution (* com.example..*.add(..))")
	//@Around("execution (* com.example..SimpleCalculator.add(..))")
	//@Around("execution (* com.example..SimpleCalculator.*(..))")
	@Around("within (com.example..*)")
	public Object myAdvise(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("Before Method runs");
		Object obj = pjp.proceed();
		System.out.println("After Method runs");
		return obj;
	}
}
