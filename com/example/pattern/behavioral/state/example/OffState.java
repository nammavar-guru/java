package com.example.pattern.behavioral.state.example;

public class OffState implements State{
	public void operation(Context context) {
		System.out.println("Set Off State");
		context.setState(new OnState());
		
	}
}
