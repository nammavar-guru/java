package com.example.SpringAOP.Example2;

import org.springframework.stereotype.Component;

@Component
public class SimpleCalculator {
	public int add(int x,int y) {
		System.out.println("Total:"+ (x+y));
		return x+y;
	}
}
