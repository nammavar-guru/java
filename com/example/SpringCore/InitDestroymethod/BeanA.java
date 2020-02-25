package com.example.SpringCore.InitDestroymethod;

public class BeanA {
	public void methodA() {
		System.out.println("Prints BeanA - methodA");
	}
	
	public void destroy() {
		System.out.println("BeanA - Destroy");
	}
	
	public void init() {
		System.out.println("BeanA - init");
	}
}
