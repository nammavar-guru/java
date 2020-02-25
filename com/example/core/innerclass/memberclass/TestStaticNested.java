package com.example.core.innerclass.memberclass;

class TestStaticNested{  
	 static private int data=30;  
	 static class Inner{  
	  void msg(){System.out.println("data is "+data);}  
	 }  
	 public static void main(String args[]){  
	  TestStaticNested.Inner in= new TestStaticNested.Inner();  
	  in.msg();
	  
	  //TestStaticNested t = new TestStaticNested();
	  //t.
	 }  
	}  
