package com.example.core.thread.concurrency.CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WithoutCountDownLatchExample2 {

	
	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(4);
		
		executor.submit(new DependentServiceWO());
		executor.submit(new DependentServiceWO());
		executor.submit(new DependentServiceWO());
		
		
		System.out.println("All dependent services are executed");
		
		executor.shutdown();
	}

}

class DependentServiceWO implements Runnable {

	public DependentServiceWO() {
	
	}
	
	public void run(){
		System.out.println("Reduced to count");
	}
	
	
}