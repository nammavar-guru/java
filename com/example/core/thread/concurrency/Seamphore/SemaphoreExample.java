package com.example.core.thread.concurrency.Seamphore;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {
	 static int SharedValue=0;
	 
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Semaphore semaphore = new Semaphore(1);
		
		
		Thread incrementThread = new Thread(()->{ 
			 System.out.println(Thread.currentThread().getName()+
                     " is waiting for permit");
			try {
				semaphore.acquire();
				  System.out.println(Thread.currentThread().getName()+
                          " has got permit");
				  for(int i=0;i<5;i++){          
                      Thread.sleep(1000);
                      System.out.println(Thread.currentThread().getName()+
                                    " >"+SemaphoreExample.SharedValue++);
                }
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+
                    " has released permit");
			semaphore.release();
			
		}, "IncrementThread" );
		
		
		Thread decrementThread = new Thread(()->{ 
			 System.out.println(Thread.currentThread().getName()+
                    " is waiting for permit");
			try {
				semaphore.acquire();
				  System.out.println(Thread.currentThread().getName()+
                         " has got permit");
				  for(int i=0;i<5;i++){          
                     Thread.sleep(1000);
                     System.out.println(Thread.currentThread().getName()+
                                   " >"+SemaphoreExample.SharedValue--);
               }
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+
                    " has released permit");
			semaphore.release();
		},"decrementThread" );
		
		incrementThread.start();
		decrementThread.start();
		
	}

}
