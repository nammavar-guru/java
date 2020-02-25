package com.example.pattern.creational.Factory;

public class ConsoleLogger implements Logger {

	public void error(String message) {
		System.err.println("ERROR:"+message);	
	}
	public void debug(String message) {
		System.err.println("DEBUG:"+message);
	}
}
