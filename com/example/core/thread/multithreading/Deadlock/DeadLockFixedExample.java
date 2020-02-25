package com.example.core.thread.multithreading.Deadlock;

class C implements Runnable {
	public void run() {
		synchronized(C.class) {
			System.out.println("Acquired the A lock");
			synchronized(D.class) {
				System.out.println("Internally acquires the B lock in the A.class");
					
			}
		}
	}
}
class D implements Runnable {
	public void run() {
		synchronized(C.class) {
			System.out.println("Acquired the B lock");
			synchronized(D.class) {
				System.out.println("Internally acquires the A lock in the B.class");
			}
		}
	}
}

public class DeadLockFixedExample {
	public static void main(String[] args) throws Exception {
		Thread c = new Thread(new C());
		Thread d = new Thread(new D());
		c.start();
		d.start();
	}
}
