package com.example.pattern.structural.Decorator.example3;

public class DecoratorPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Component add = new BorderDecorator(new TextField());
		add.add();
	}

}
