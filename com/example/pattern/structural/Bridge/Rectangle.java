package com.example.pattern.structural.Bridge;

public class Rectangle extends Shape{
	public Rectangle(Color c) {
		super(c);
	}
	public void applyColor() {
		System.out.println("Applying the Color");
		color.applyColor();
	}
}
