package com.example.core.thread.concurrency.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class QueueLengthLockExample {

	public static void main(String[] args) {
		ReentrantLock lock = new ReentrantLock();

		Thread runnableThread = new Thread(() -> {

			System.out.println(Thread.currentThread().getName() + " is Waiting to acquire lock");

			lock.lock();
				System.out.println(Thread.currentThread().getName() + " has acquired lock.");

				try {
					Thread.sleep(5000);
					System.out.println(Thread.currentThread().getName() + " is sleeping.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(">>>>--- getQueueLength = "+lock.getQueueLength()+"---<<<<");
		           

			 System.out.println(Thread.currentThread().getName() + " has released lock.");
			 lock.unlock();
		});

		new Thread(runnableThread, "Thread1").start();
		new Thread(runnableThread, "Thread2").start();
		new Thread(runnableThread, "Thread3").start();
		System.out.println("Main Thread ends");
	}

}
