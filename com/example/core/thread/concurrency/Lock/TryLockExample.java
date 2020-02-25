package com.example.core.thread.concurrency.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockExample {

	public static void main(String[] args) {
// If the thread couldn't acquire the lock because it was held by some other thread, 
//		then it returns immediately instead of waiting for the lock to be released.
		Lock lock = new ReentrantLock();

		Thread runnableThread = new Thread(() -> {

			System.out.println(Thread.currentThread().getName() + " is Waiting to acquire lock");

			if (lock.tryLock()) {

				System.out.println(Thread.currentThread().getName() + " has acquired lock.");

				try {
					Thread.sleep(5000);
					System.out.println(Thread.currentThread().getName() + " is sleeping.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			else {
				System.out.println(Thread.currentThread().getName() + " didn't got lock.");

			}
			// System.out.println(Thread.currentThread().getName() + " has released lock.");

			// lock.unlock();
		});

		new Thread(runnableThread, "Thread1").start();
		new Thread(runnableThread, "Thread2").start();
	}

}
