package com.example.core.thread.multithreading.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {
	
	public static void main(String[] args) throws Exception, ExecutionException {
		
		Thread task1 = new Thread(() -> { Integer sum = 10; });
		Thread task2 = new Thread(() ->{  new Integer(20); });
		ExecutorService executor = Executors.newFixedThreadPool(2);
		Future<Integer> inta = (Future<Integer>) executor.submit(task1);
		Future<Integer> intb = (Future<Integer>) executor.submit(task2);
		System.out.println("Print inta future "+inta.get());
		System.out.println("Print intb future "+intb.get());
		
		Callable<Integer> c =() -> { int a = 10;
			System.out.println("Callable interface"); 
		return a;	
		};
		
		
		Future<Integer> result = executor.submit(c);
		System.out.println("Result"+result.get());
		executor.shutdown();
}
}