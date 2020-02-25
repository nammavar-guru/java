package com.example.core.thread.multithreading.Deadlock;

class A implements Runnable {
	public void run() {
		synchronized(A.class) {
			System.out.println("Acquired the A lock");
			synchronized(B.class) {
				System.out.println("Internally acquires the B lock in the A.class");
					
			}
		}
	}
}
class B implements Runnable {
	public void run() {
		synchronized(B.class) {
			System.out.println("Acquired the B lock");
			synchronized(A.class) {
				System.out.println("Internally acquires the A lock in the B.class");
			}
		}
	}
}

public class DeadLockExample {
	public static void main(String[] args) throws Exception {
		Thread a = new Thread(new A());
		Thread b = new Thread(new B());
		a.start();
			//a.join();
		b.start();
	}
}
