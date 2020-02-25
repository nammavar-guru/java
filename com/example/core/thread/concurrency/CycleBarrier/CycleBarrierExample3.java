package com.example.core.thread.concurrency.CycleBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CycleBarrierExample3 {

	public static void main(String[] args) throws Exception{
		Thread cycleBarrierEventThread = new Thread(()-> { System.out.println("cycleBarrierEvent is triggered");});
		
		//CyclicBarrier barrier = new CyclicBarrier(2);
		CyclicBarrier barrier = new CyclicBarrier(2,cycleBarrierEventThread);
		ExecutorService exe = Executors.newFixedThreadPool(2);

		Runnable run =()->{
			
			try {
				System.out.println("Runnable thread");
				barrier.await();
				System.out.println("After Barrier Point reached... it runs");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		exe.submit(run);
		exe.submit(run);
		
	
		exe.submit(run);
		exe.submit(run);
		
		System.out.println("Main thread");
		exe.shutdown();
		
	}

}
