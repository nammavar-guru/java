package com.example.pattern.structural.Decorator.Example2;

public class BorderDecorator extends Decorator{

	public BorderDecorator(widget widget) {
		super(widget);
	}
	
	public void draw() {
		super.draw();
		System.out.println("Border Decorator");
	}
}
