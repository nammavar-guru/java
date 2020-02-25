package com.example.pattern.structural.Decorator;

public class SimpleDecorator implements App {
	private final App delegate;
	
	public SimpleDecorator(App delegate) {
		this.delegate = delegate;
	}
	
	public void developApp() {
		System.out.println("preparing extra content");
		this.delegate.developApp();
		System.out.println("Fine-tuning the app to be more perfect...");
	}
}
