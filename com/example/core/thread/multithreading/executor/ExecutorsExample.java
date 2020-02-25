package com.example.core.thread.multithreading.executor;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {

	public static void main(String[] args) {
		System.out.println("Inside the"+Thread.currentThread().getName());
		ExecutorService es = Executors.newFixedThreadPool(2);
		Runnable task1 = () -> {
			System.out.println(new Date() +":"+"Executing Task1 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };
        
        Runnable task2 = () -> {
			System.out.println(new Date() +":"+"Executing Task2 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };
        
        Runnable task3 = () -> {
			System.out.println(new Date() +":"+"Executing Task3 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };
        
        System.out.println("Submitting the tasks for execution...");
        es.submit(task1);
        es.submit(task2);
        es.submit(task3);
        
		es.shutdown();
	}

}
