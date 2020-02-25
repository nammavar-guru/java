package com.example.core.thread.concurrency.Forkjoin;

import java.util.concurrent.RecursiveTask;

public class factorial extends RecursiveTask<Integer> {
	   private int n;

	   factorial(int n) {
	      this.n = n;
	   }

	   public Integer compute() {
	      if (n <= 1) {
	         return n;
	      }
	      factorial t1 = new factorial(n - 1);
	      factorial t2 = new factorial(n - 2);
	      t1.fork();
	      t2.fork();
	     return t2.join()+ t1.join();
	   }
	   
	   
	   public static void main(String args[]) {
		   factorial f = new factorial(8);
		   System.out.println("Output"+f.compute());
	   }
	}