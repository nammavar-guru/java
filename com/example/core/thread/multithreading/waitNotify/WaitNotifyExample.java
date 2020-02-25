package com.example.core.thread.multithreading.waitNotify;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WaitNotifyExample {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		Runnable producer = () -> {
									for (int i=0;i<10;i++) {
										lock.lock();
										try {
											System.out.print("A");
										}finally {
											lock.unlock();
										}
									}
								  };
	}

}
