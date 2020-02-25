package com.example.java8.methodReference.instanceReference;

import java.util.function.BiFunction;

class Arthimetic {
	public int add(int a, int b) {
		return a + b;
	}
}

public class BiFunctionInsanceReferenceExample {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = new Arthimetic()::add;
		System.out.println(adder.apply(10, 20));
	}

}
