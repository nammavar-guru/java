package com.example.core.thread.concurrency.Seamphore;

import java.util.concurrent.Semaphore;

public class SemaphoreProducerConsumer {

	static Semaphore sProducer = new Semaphore(1);
	static Semaphore sConsumer = new Semaphore(0);
	
	public static void main(String[] args) {
		Thread producer = new Thread(()->  {
			for(int i=1;i<=5;i++){
             try {
				sProducer.acquire();
				//Thread.sleep(100);
				System.out.println("Produced : "+i);
                sConsumer.release();
            	//Thread.sleep(100);
    			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
			} 
			},"ProducerThread");
	
		Thread consumer = new Thread(()->{
			for(int i=1;i<=5;i++) {
				try {
					sConsumer.acquire();
					System.out.println("Consumed : "+i);
                    sProducer.release();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();
	}
}
