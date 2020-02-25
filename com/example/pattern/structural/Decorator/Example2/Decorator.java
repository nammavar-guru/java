package com.example.pattern.structural.Decorator.Example2;

abstract public class Decorator implements widget {
	private widget widget;
	
	public Decorator(widget widget) {
		this.widget=widget;
	}
	
	public void draw() {
		widget.draw();
	}
}
