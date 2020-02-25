package com.example.pattern.structural.Bridge;

public class BridgePatternTest {
	public static void main(String args[]) {
		//Color col = new RoseColor();
		//col.applyColor();
		Shape shape = new Rectangle(new PinkColor());
		shape.applyColor();
	}
}
