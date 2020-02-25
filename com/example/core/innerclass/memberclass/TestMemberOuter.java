package com.example.core.innerclass.memberclass;

class TestMemberOuter{  
	 private int data=30;  
	  
	 public static void main(String args[]){  
	  TestMemberOuter.Inner in= new TestMemberOuter().new Inner();  
	  in.msg();  
	 }
	 
	 class Inner{  
		  void msg(){System.out.println("data is "+data);}  
		 } 
	}  
