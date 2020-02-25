package com.example.java8.methodReference.staticReference;

public class ThreadStaticReference {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(()->System.out.println("Thread1 run method executes"));
		thread1.start();
		
		Thread thread2 = new Thread(ThreadStaticReference::ThreadRunnable);
		thread2.start();
		
	}
	
	public static void ThreadRunnable() {
		System.out.println("Thread2 Runnable run method executes");
	}

}
