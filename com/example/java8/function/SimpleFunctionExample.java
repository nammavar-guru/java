package com.example.java8.function;
import java.util.function.Function;
import java.util.function.BiFunction;

public class SimpleFunctionExample {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f1 = f->f*2;
		Function<Integer,Integer> f2 = f->f*f*f;
		
		
		System.out.println("andThen function-->"+f1.andThen(f2).apply(3));
		//f1 and then f2
		System.out.println("compose function-->"+f1.compose(f2).apply(3));
		//f2 and then f1 - Parenthesis is running first
	}

}
