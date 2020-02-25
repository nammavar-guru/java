package com.example.java8.Lambda;

class RunnableExample implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread :"+i);
		}
	}
}
public class MultiThreadingExample {
	public static void main(String args[]) {
	
	RunnableExample re = new RunnableExample();
	Thread t = new Thread(re);
	t.start();
	
	for(int i=0;i<10;i++) {
		System.out.println("Main Thread :"+i);
	}
	}
	
}
