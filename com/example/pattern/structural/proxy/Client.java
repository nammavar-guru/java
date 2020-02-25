package com.example.pattern.structural.proxy;

public class Client {

	public static void main(String[] args) {
		RealObjectProxy rop = new RealObjectProxy();
		rop.doSomething();

	}

}
