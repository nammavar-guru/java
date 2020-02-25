package com.example.core.thread.concurrency.CycleBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CycleBarrierExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Thread cycleBarrierEventThread = new Thread(()-> { System.out.println("cycleBarrierEvent is triggered");});
		
		CyclicBarrier cb = new CyclicBarrier(3,cycleBarrierEventThread);
		
		Thread childThread = new Thread(()-> { 
			try {
				 System.out.println(Thread.currentThread().getName() +
	                        " is waiting for all other threads to reach common barrier point");
				Thread.sleep(1000);
				cb.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			 System.out.println("As all threads have reached common barrier point "
                     + Thread.currentThread().getName() +
                     " has been released");
			 });
		
		new Thread(childThread,"ChildThread1").start();
		new Thread(childThread,"ChildThread2").start();
		new Thread(childThread,"ChildThread3").start();
		
		try {
			Thread.sleep(5000);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		
		new Thread(childThread,"ChildThread4").start();
		new Thread(childThread,"ChildThread5").start();
		new Thread(childThread,"ChildThread6").start();		
		System.out.println("Main thread has ended");

	}

}
