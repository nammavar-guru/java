package com.example.pattern.structural.Bridge;

public abstract class Shape {
	protected Color color;
	public Shape(Color c) {
		this.color = c;
	}
	abstract void applyColor();
}
