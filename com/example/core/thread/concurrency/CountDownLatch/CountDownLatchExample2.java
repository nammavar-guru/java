package com.example.core.thread.concurrency.CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchExample2 {

	
	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(1);
		CountDownLatch latch = new CountDownLatch(2);
		
		executor.submit(new DependentService(latch));
		executor.submit(new DependentService(latch));
		executor.submit(new DependentService(latch));
		
		latch.await();
		
		System.out.println("All dependent services are executed");
		
		executor.shutdown();
	}

}

class DependentService implements Runnable {
	CountDownLatch latch;

	public DependentService(CountDownLatch latch) {
	
		this.latch = latch;
	}
	
	public void run(){
		latch.countDown();
		System.out.println("Reduced to count");
	}
	
	
}