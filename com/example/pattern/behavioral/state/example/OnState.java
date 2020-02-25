package com.example.pattern.behavioral.state.example;

public class OnState implements State{
	public void operation(Context context) {
		System.out.println("Set On State");
		context.setState(new OffState());
	}
}
