package com.example.core.thread.concurrency.BlockingQueue;

import java.util.LinkedList;
import java.util.List;

class Producer implements Runnable {
	int capacity = 2;
	int initialSize = 0;
	LinkedList<Integer> list = new LinkedList<>();

	public void run() {
		while (true) {
			synchronized (this) {
				if (list.size() == capacity) {
					try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					initialSize++;
					System.out.println("Producer is still Producing, Produced : " + initialSize);
					list.add(initialSize);
					this.notify();
				}
			}
		}
	}
}

class Consumer implements Runnable {
	Producer producer;
	
	public Consumer() {
	}

	public Consumer(Producer producer) {
		this.producer = producer;
	}

	public void run() {
		while (true) {
			synchronized (this.producer) {

				if (producer.list.size() > 0) {

					System.out.println("Consumer is still consuming, Consumed : ");
					producer.list.removeFirst();
				} else {
					try {
						this.producer.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		}
	}
}

public class ProducerConsumerWaitNotifyExample {

	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer(producer);

		Thread producerThread = new Thread(producer, "ProducerThread");
		Thread consumerThread = new Thread(consumer, "ConsumerThread");
		producerThread.start();
		consumerThread.start();
	}

}
