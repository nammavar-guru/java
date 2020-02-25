package com.example.pattern.behavioral.strategy.Example2;

public class RoadStrategy implements RouteStrategy{
	
	public void buildRoute(String source, String destination) {
		System.out.println("Road Route Shows between "+source+" and "+destination+".");
	}

}
