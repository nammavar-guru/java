package com.example.core.thread.multithreading;

import java.util.Date;

public class DaemonThreadExample implements Runnable{
	public void run() {
		try {
			if(Thread.currentThread().isDaemon()) 
	        {  
	            System.out.println(Thread.currentThread().getName() + " is Daemon thread");  
	        }  
	          
	        else
	        {  
	            System.out.println(Thread.currentThread().getName() + " is User thread");  
	        }  
		}catch(Exception e) { System.out.println("run Exception"+e); }
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DaemonThreadExample te = new DaemonThreadExample();
		Thread t = new Thread(te);
		Thread t1 = new Thread(te);
		Thread t2 = new Thread(te);
		
		Thread daemon = new Thread(()
				  -> System.out.println("Hello from daemon!"));
				daemon.setDaemon(true);
				daemon.start();
				
		t.setDaemon(true);
		t.start();
		t1.start();
		t2.setDaemon(true);
		t2.start();
		//System.out.println(new Date() +":"+"Main Thread Ends"); 
		
	}

}
