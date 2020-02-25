package com.example.core.thread.concurrency.phaser;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class PhaserCountDownLatchExample2 {

	
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(4);
		Phaser latch = new Phaser(2);
		
		executor.submit(new DependentService(latch));
		executor.submit(new DependentService(latch));
		
		
		latch.awaitAdvance(1);
	
		System.out.println("Phase 2");
		Phaser l = new Phaser(1);
		
		executor.submit(new DependentService(l));
		executor.submit(new DependentService(l));
		l.awaitAdvance(1);
		
		System.out.println("All dependent services are executed");
		
		executor.shutdown();
	}

}

class DependentService implements Runnable {
	Phaser latch;

	public DependentService(Phaser latch) {
	
		this.latch = latch;
	}
	
	public void run(){
		latch.arrive();
		System.out.println("Reduced to count");
	}
	
	
}