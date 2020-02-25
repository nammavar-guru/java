package com.example.java8.Lambda;

public class MultiThreadingLambdaExpExample {
	public static void main(String args[]) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Lambda Expression of Child Thread :" + i);
			}
		};

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Lambda Expression of Main Thread :" + i);
		}
	}

}
