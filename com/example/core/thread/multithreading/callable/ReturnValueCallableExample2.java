package com.example.core.thread.multithreading.callable;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ReturnValueCallableExample2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<Future<Integer>> returnValue= executorService.
				invokeAll(Arrays.asList(new MultiplyNumber(1),new MultiplyNumber(2),
						new MultiplyNumber(3),new MultiplyNumber(4),new MultiplyNumber(5),new MultiplyNumber(6)));

			//returnValue.stream().forEach((i)->System.out::println);
		for (Future<Integer> value:returnValue) {
			System.out.println("Value :"+value.get());
		}
		executorService.shutdown();
	}
}

 class MultiplyNumber implements Callable<Integer>{
	private int n;
	public MultiplyNumber(int n) {
		this.n=n;
	}
	
	public Integer call() {
		return n*n;
	}
}