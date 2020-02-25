package com.example.core.thread.concurrency.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueue {

	
	public static void main(String[] args) {
		 BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>(5); 
		
		Thread producer = new Thread(()->  {
			 System.out.println("Produced Test : ");
			for(int i=1;i<=5;i++){
             try {
   				 System.out.println("Produced : "+i);
            	 sharedQueue.put(i);
            	 if(i==1)
            	 Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             
			} 
			},"ProducerThread");
	
		Thread consumer = new Thread(()->{
			while(true) {
					try {
						System.out.println("Consumed test");
						System.out.println("Consumed : "+sharedQueue.take());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}		
            		});
		consumer.start();
		producer.start();
		//consumer.start();
	}


}
