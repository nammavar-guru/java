package com.example.pattern.behavioral.strategy.Example2;

public class WalkingStrategy implements RouteStrategy{
	
	public void buildRoute(String source, String destination) {
		System.out.println("Cycle Route Shows between "+source+" and "+destination+".");
	}

}
