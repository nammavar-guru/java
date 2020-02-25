package com.example.pattern.structural.Decorator.Example2;

public class ScrollDecorator extends Decorator{

	public ScrollDecorator(widget widget) {
		super(widget);
	}
	
	public void draw() {
		super.draw();
		System.out.println("Scroll Decorator");
	}
}
