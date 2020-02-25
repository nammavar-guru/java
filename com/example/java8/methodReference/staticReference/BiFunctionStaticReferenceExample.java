package com.example.java8.methodReference.staticReference;

import java.util.function.BiFunction;

class Arthimetic {
	public static int add(int a, int b) {
		return a + b;
	}
}

public class BiFunctionStaticReferenceExample {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Arthimetic::add;
		System.out.println(adder.apply(10, 20));
	}

}
