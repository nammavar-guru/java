package com.example.core.thread.concurrency.CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

	public static void main(String[] args) throws Exception {
			CountDownLatch countDownLatch =new CountDownLatch(3);
			 System.out.println("CountDownLatch has been created with count=3");
			 
			 Thread t = new Thread(()-> {
				 for(int i=2;i>=0;i--){
	                  
	                  countDownLatch.countDown();           
	                  System.out.println(Thread.currentThread().getName()+
	                               " has reduced latch count to : "+ i);
	                  try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 	}
			 },"GuruThread");
			 
			 t.start();
			
			countDownLatch.await();
			System.out.println("count has reached zero, "+
                    Thread.currentThread().getName()+" thread has ended");
	}

}
