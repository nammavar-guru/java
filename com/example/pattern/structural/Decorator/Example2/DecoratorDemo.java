package com.example.pattern.structural.Decorator.Example2;

public class DecoratorDemo {

	public static void main(String[] args) {
		widget wgt = new BorderDecorator(new TextField(80,20));
		wgt.draw();
		
		widget wg = new ScrollDecorator(new BorderDecorator(new TextField(80,20)));
		wg.draw();
		
	}

}
