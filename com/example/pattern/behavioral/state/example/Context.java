package com.example.pattern.behavioral.state.example;

public class Context {
	State state;

	public Context() {
		state = new OnState();
	}
	public Context(State state) {
		this.state = state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void operation() {
		state.operation(this);
	}
}
