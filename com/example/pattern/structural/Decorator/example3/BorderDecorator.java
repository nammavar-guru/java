package com.example.pattern.structural.Decorator.example3;

public class BorderDecorator implements Component {
	Component comp;
	public BorderDecorator(Component comp) {
		this.comp = comp;
	}
	public void add() {
		comp.add();
		System.out.println("Border Style added");
		
	}
}
