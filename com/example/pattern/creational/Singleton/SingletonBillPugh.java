package com.example.pattern.creational.Singleton;

public class SingletonBillPugh {

	private SingletonBillPugh() {
	
	}
	
	private static class StaticInstance{
		static SingletonBillPugh instance= new SingletonBillPugh();
	}
	
	public static SingletonBillPugh getInstance() {
		return StaticInstance.instance;
	}
}
