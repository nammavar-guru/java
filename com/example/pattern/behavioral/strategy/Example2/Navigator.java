package com.example.pattern.behavioral.strategy.Example2;

public class Navigator {
	RouteStrategy routeStrategy;
	
	
	public void setRouteStrategy(RouteStrategy routeStrategy) {
		this.routeStrategy = routeStrategy;
	}


	public void buildRoute(String source, String destination) {
		routeStrategy.buildRoute(source, destination);
	}
}
