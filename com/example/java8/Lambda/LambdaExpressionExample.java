package com.example.java8.Lambda;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class LambdaExpressionExample {

	public static void main(String[] args) throws Exception {
		Runnable r = ()-> System.out.println("Runnable run method calls");
		Thread t = new Thread(r);
		t.start();
		
		Callable<Void> c = ()-> { System.out.println("C- Callable - run method calls"); return null;};
		FutureTask<Void> ft = new FutureTask<>(c);
		Thread t1 = new Thread(ft);
		t1.start();
		
		Callable<Void> c1 = ()-> { System.out.println("C1- Callable - run method calls"); return null;};
		ExecutorService es = Executors.newCachedThreadPool(); 
		Future<Void> f = es.submit(c1);
		
		Callable<String> c2 = ()-> "C2- Callable - run method calls";
		Future<String> f1 = es.submit(c2);
		System.out.println(f1.get());
		
		//Thread.sleep(200000);
		es.shutdown();
		}

}
