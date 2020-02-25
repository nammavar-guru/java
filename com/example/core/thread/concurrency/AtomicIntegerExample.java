package com.example.core.thread.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
	
	public static void main(String[] args) {
	
		Data data = new Data();
		  // Starting 6 threads
		  ExecutorService ex = Executors.newFixedThreadPool(6);
		  ex.execute(new VTask(data));
		  ex.execute(new VTask(data));
		  ex.execute(new VTask(data));
		  ex.execute(new VTask(data));
		  ex.execute(new VTask(data));
		  ex.execute(new VTask(data));
		  //shutting down the executor service
		  ex.shutdown();
	
	}

}

class Data{
	 //public volatile int counter = 0;
	 AtomicInteger counter = new AtomicInteger(0);
	 public synchronized int getCounter() {
	  return counter.get();
	 }

	 public synchronized void incrementCounter() {
	  
	 counter.incrementAndGet();
	 }
	 
	}

	// Thread 
	class VTask implements Runnable{
	 private Data data;
	 public VTask(Data data){
	  this.data = data;
	 }
	 
	 @Override
	 public void run() {
	  System.out.println("Value for Thread " + Thread.currentThread().getName() + 
	    " Before increment " + data.getCounter());
	  data.incrementCounter();
	  System.out.println("Value for Thread " + Thread.currentThread().getName() + 
	    " After increment " + data.getCounter());
	  
	 }
	 
	}	