package com.example.pattern.behavioral.command;

public class Agent {
	//Invoker object looks for appropriate object which can handle his command and 
	//passes the command to the corresponding object which executes it.
	public void placeOrder(Order order) {
		order.execute();
	}
}
