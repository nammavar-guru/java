package com.example.core.thread.multithreading;

class testRunnable implements Runnable{
	public void run() {
		System.out.println("test runnable"+Thread.currentThread().getName());
	}
}
public class TestThread {

	public static void main(String[] args) {
		testRunnable tr = new testRunnable();
		Thread t1 = new Thread(tr,"thread1");
		Thread t2 = new Thread(tr,"thread2");
		Thread t3 = new Thread(tr,"thread2");
		
		t1.start();
		t1= t2;
		t1.start();
		//t2=t1;
		//t2.start(); //IllegalThreadStateException
		t3.run();
	}

}
