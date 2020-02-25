package com.example.core.thread.multithreading.synchronizedmethod.objectlevel;

class Table{  
	static synchronized void printTable(int n){//synchronized method  
	   for(int i=1;i<=5;i++){  
	     System.out.println(Thread.currentThread().getName()+"--> n: "+n+" i: "+i+" Result: "+n*i);  
	     try{  
	      Thread.sleep(400);  
	     }catch(Exception e){System.out.println(e);}  
	   }  
	  
	 }  
	}  
	  
	class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	}  
	  
	}  
	class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  
	}  
	  
	public class TestSynchronization1{  
	public static void main(String args[]){  
	Table obj = new Table();//only one object
	Table obj2 = new Table();
	MyThread1 t1=new MyThread1(obj);  
//	MyThread2 t2=new MyThread2(obj);
	MyThread2 t2=new MyThread2(obj2);
	t1.start();  
	t2.start();  
	}  
	} 