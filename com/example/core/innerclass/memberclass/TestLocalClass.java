package com.example.core.innerclass.memberclass;

class TestLocalClass{  
	 private int data=30; 
	 public void print() {
	 class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }
	 Inner i = new Inner();
	 i.msg();
	 }
	 public static void main(String args[]){  
	  TestLocalClass in= new TestLocalClass();  
	  in.print();  
	 }  
	}  
