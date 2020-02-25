package com.example.core.thread.concurrency.phaser;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class PhaserCycleBarrierExample2 {

	
	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(4);

		Phaser latch = new Phaser(3);
		executor.submit(new DependentServiceP(latch));
		executor.submit(new DependentServiceP(latch));
		executor.submit(new DependentServiceP(latch));
		
		Thread.sleep(2000);
		executor.submit(new DependentServiceP(latch));
		executor.submit(new DependentServiceP(latch));
		executor.submit(new DependentServiceP(latch));
		
		
		executor.shutdown();
	}

}

class DependentServiceP implements Runnable {
	Phaser barrier;

	public DependentServiceP(Phaser barrier) {
		this.barrier = barrier;
	}
	
	public void run(){
		
			try {
				System.out.println("Reduced to count");
				barrier.arriveAndAwaitAdvance();
				System.out.println("Reached Barrier Point");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	
}