package com.example.core.thread.multithreading.callable;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ReturnValueCallableExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Future<Integer> returnValue= executorService.submit(()-> {
			int i =5;
			return i *i;
		});
		
		System.out.println(new Date() +":"+"returnValue.get method : " + returnValue.get());
		executorService.shutdown();
	}

}
