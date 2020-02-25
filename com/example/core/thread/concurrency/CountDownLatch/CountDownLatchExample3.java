package com.example.core.thread.concurrency.CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample3 {

	public static void main(String[] args) throws Exception {
		
		CountDownLatch latch = new CountDownLatch(2);
		Runnable task =()->{
			latch.countDown();
			System.out.println("Task Executes");
		};
		
		ExecutorService exe = Executors.newFixedThreadPool(1);
		exe.execute(task);
		exe.execute(task);
		
		latch.await();
		System.out.println("Main thread Executes");
		exe.shutdown();
		
	}

}
