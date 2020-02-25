package com.example.core.thread.multithreading;

import java.util.Date;

public class ThreadExampleYield implements Runnable{
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+":"+"run method startts");
		Thread.sleep(3000);
		System.out.println(Thread.currentThread().getName()+":"+"run method ends");
		}catch(Exception e) { System.out.println("run Exception"+e); }
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ThreadExampleYield te = new ThreadExampleYield();
		Thread t = new Thread(te);
		t.start();
		Thread t2 = new Thread(te);
		System.out.println(new Date() +":"+"Create Thread T2"); 
		t2.start();
		Thread.yield();
		Thread t3 = new Thread(te);
		t3.start();
		System.out.println(new Date() +":"+"Main Thread continues after t2.join"); 
		
	}

}
