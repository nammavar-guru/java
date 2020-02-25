package com.example.core.thread.concurrency.phaser;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class PhaserExample {

	public static void main(String[] args) throws Exception {
Phaser semaphore = new Phaser(1);
		
		ExecutorService ex = Executors.newFixedThreadPool(5);
		
		Runnable r= ()->{
			semaphore.register();
				semaphore.arriveAndAwaitAdvance();
				System.out.println("Runnable Executing");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				semaphore.arriveAndDeregister();
				
				
		};
		ex.submit(r);
		ex.submit(r);
		semaphore.arriveAndAwaitAdvance();
		//semaphore.arrive
		//Thread.sleep(1000);
		System.out.println("test");

	}

}
