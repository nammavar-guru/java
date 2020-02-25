package com.example.java8.Lambda;

public class TestRunnable {
	public static void main(String[] args) {
		Runnable runnable =()->System.out.println("Runnable interface run method");
		Thread thread1 = new Thread(runnable);
		thread1.start();
	}
}
