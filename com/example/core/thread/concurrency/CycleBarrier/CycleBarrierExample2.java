package com.example.core.thread.concurrency.CycleBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CycleBarrierExample2 {

	
	public static void main(String[] args) throws Exception {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		//CountDownLatch latch = new CountDownLatch(3);
		CyclicBarrier latch = new CyclicBarrier(3);
		executor.submit(new DependentService(latch));
		executor.submit(new DependentService(latch));
		executor.submit(new DependentService(latch));
		
		//Thread.sleep(2000);
		executor.submit(new DependentService(latch));
		executor.submit(new DependentService(latch));
		executor.submit(new DependentService(latch));
		
		
		executor.shutdown();
	}

}

class DependentService implements Runnable {
	CyclicBarrier barrier;

	public DependentService(CyclicBarrier barrier) {
	
		this.barrier = barrier;
	}
	
	public void run(){
		
			try {
				System.out.println("Reduced to count");
				barrier.await();
				System.out.println("After Barrier Point reached... it runs");

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	
	
}