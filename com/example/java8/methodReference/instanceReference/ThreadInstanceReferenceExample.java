package com.example.java8.methodReference.instanceReference;

public class ThreadInstanceReferenceExample {

	public void tetInterfaceMethod() {
		System.out.println("test interface method");
	}

	public static void main(String[] args) {

		Thread thread = new Thread(new ThreadInstanceReferenceExample()::tetInterfaceMethod);
		thread.start();
	}

}
