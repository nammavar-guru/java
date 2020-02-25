package com.example.core.thread.multithreading.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public class ExecutorExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = ()->{ System.out.println("From Runnable interface it is running"); };
		
		Thread t = new Thread(()->{ 
									System.out.println("From thread class it is running");
								  }
							);
		
		Callable<Void> c =()->{  System.out.println("From Callable interface it is running"); return null; };
 		Executor e = new NewThreadExecutor();
		e.execute(r);
		e.execute(t);
		//e.execute(c);
	}

}
