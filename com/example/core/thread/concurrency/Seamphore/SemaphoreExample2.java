package com.example.core.thread.concurrency.Seamphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaphore semaphore = new Semaphore(2);
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		
		Runnable r= ()->{
				try {
					semaphore.acquire();
					System.out.println("Runnable Executing");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		};
		ex.submit(r);
		ex.submit(r);
		semaphore.release();
		ex.submit(r);
		
		ex.submit(r);
		semaphore.release();
		ex.submit(r);
	}

}
