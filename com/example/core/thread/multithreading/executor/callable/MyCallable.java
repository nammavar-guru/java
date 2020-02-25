package com.example.core.thread.multithreading.executor.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;

public class MyCallable {
	public static void main(String args[]) throws Exception {
		
		Callable<Integer> call = ()->{
			
			int count = ThreadLocalRandom.current().nextInt(1,11);
			for(int i=0;i<count;i++) {
				System.out.println("Ruunning : "+count);
			}
			return count;
		};
		
		
		Callable<String> c = ()->{ 
			return Thread.currentThread().getName();
		};
		
		ExecutorService ex = Executors.newCachedThreadPool();
		Future<Integer> f = ex.submit(call);
		System.out.println("Output:"+f.get());
		
		Future<String> f1 = ex.submit(c);
		System.out.println("Output:"+f1.get());
		
		ex.shutdown();
	}
}
