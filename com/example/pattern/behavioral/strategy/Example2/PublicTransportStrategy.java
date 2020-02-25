package com.example.pattern.behavioral.strategy.Example2;

public class PublicTransportStrategy implements RouteStrategy{
	
	public void buildRoute(String source, String destination) {
		System.out.println("Public Transport Route shows between "+source+" and "+destination+".");
	}

}
