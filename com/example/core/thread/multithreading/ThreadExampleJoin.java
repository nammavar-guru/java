package com.example.core.thread.multithreading;

import java.util.Date;

public class ThreadExampleJoin implements Runnable{
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+":"+"run method startts");
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName()+":"+"run method ends");
		}catch(Exception e) { System.out.println("run Exception"+e); }
	}
	public static void main(String[] args) throws Exception {
		ThreadExampleJoin te = new ThreadExampleJoin();
		Thread t = new Thread(te);
		t.start();
		Thread.sleep(100);
		System.out.println(new Date() +":"+"Main Thread continues"); 
		Thread t2 = new Thread(te);
		System.out.println(new Date() +":"+"Create Thread T2"); 
		t2.start();
		System.out.println(new Date() +":"+"Main Thread continues after t2.start"); 
		//t2.join(); 
		t.join();
		System.out.println(new Date() +":"+"Main Thread continues after t2.join"); 
		
	}

}
