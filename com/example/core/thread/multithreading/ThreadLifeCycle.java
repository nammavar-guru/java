package com.example.core.thread.multithreading;

public class ThreadLifeCycle implements Runnable {

	public void run(){
		System.out.println(Thread.currentThread().getState());
		System.out.println("run2:"+Thread.currentThread().getState()); 
	}
	
	public static void main(String[] args) throws Exception {
		ThreadLifeCycle tlc = new ThreadLifeCycle();
		Thread t = new Thread(tlc);
		System.out.println(t.getState()); // NEW State
		
		t.start();
		System.out.println(t.getState()); // RUNNABLE State
		
		Thread.sleep(5000);
		System.out.println(t.getState()); //TERMINATED State
	}

}
