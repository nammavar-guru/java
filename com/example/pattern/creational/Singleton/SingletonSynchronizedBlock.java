package com.example.pattern.creational.Singleton;

public class SingletonSynchronizedBlock {
	
	static SingletonSynchronizedBlock instance =null;

	private SingletonSynchronizedBlock() {
		
	}
	
	public static SingletonSynchronizedBlock getInstance() {
		synchronized(SingletonSynchronizedBlock.class) {
			if (instance == null) {
			  instance = new SingletonSynchronizedBlock();
			}
		}
		return instance;
	}
}
