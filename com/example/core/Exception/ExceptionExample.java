package com.example.core.Exception;

public class ExceptionExample {
	
	public static int  m1() {
		int a=0;
		try {
			a= 10;
			return a;
		}
		finally {
	//		a= 20;
			return a;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int a = m1();
	 System.out.println("a"+a);
	 
	}

}
