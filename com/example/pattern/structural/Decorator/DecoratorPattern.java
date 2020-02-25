package com.example.pattern.structural.Decorator;

public class DecoratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App perfectApp = new SimpleDecorator(new IOSApp());
		perfectApp.developApp();

	}

}
