package com.example.core.thread.concurrency.ThreadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ThreadLocal threadLocal = new ThreadLocal();
		
		Runnable run = ()->{
			threadLocal.set((int)(Math.random()* 100D));
			System.out.println("Output:"+Thread.currentThread().getName()+" : "+threadLocal.get());
		};
		
		ExecutorService es= Executors.newCachedThreadPool();
		es.execute(run);
		es.execute(run);
		es.execute(run);
		
		Thread.sleep(120000);
		
		es.execute(run);
		Thread.sleep(100);
		
		es.shutdown();
		
	}

}
