package com.example.core.thread.multithreading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

	public static void main(String[] args) throws Throwable {
		Thread t1 = new Thread(()->{ System.out.println("Runnable run method running - Thread 1");});
		
		Thread t2 = new Thread(()->{ System.out.println("Runnable run method running - Thread 2");});
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(t1);
		
		executor.execute(t1);
		executor.execute(t1);
		t2.start();
		t2.join();
		executor.execute(t1);
		executor.shutdown();
	}

}
