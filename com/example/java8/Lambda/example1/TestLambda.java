package com.example.java8.Lambda.example1;

interface test{
	//public void methodA();
	//public void methodB(String msg);
	//public int methodC(int a, int b);
	public void methodD(int a, int b);
}
public class TestLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test testInterface = () -> System.out.println("Test Lambda without any parameter");
		//testInterface.methodA();
		
		//test testInterface = (msg) -> System.out.println("Test Lambda "+msg);
		//testInterface.methodB("with parameter");
		
		/*
		 * test testInterface = (a,b)->{ System.out.println("a : "+a);
		 * System.out.println("b : "+b); return (a+b); };
		 * System.out.println("add operation : "+testInterface.methodC(10, 20));
		 */
		
		test testInterface = (a,b)->{ System.out.println("a : "+a);
									  System.out.println("b : "+b);
									  System.out.println("Multiply Operation : "+ (a*b));
		};
		
		testInterface.methodD(10, 20);
	}

}
