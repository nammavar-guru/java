package com.example.pattern.behavioral.strategy.Example2;

public class StrategyPattern {

	public static void main(String[] args) {
		Navigator strategy = new Navigator();
		strategy.setRouteStrategy(new RoadStrategy());
		strategy.buildRoute("Chennai", "Bangalore");
	}

}
