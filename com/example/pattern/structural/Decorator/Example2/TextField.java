package com.example.pattern.structural.Decorator.Example2;

public class TextField implements widget{
	private int width,height;
	
	public TextField(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	public void draw() {
		System.out.println("Text Field "+width+" ,"+height);
	}
}
