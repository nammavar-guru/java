package com.example.pattern.structural.FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static FlyweightFactory flyweightFactory;
	Map<String,Flyweight> flyweightPool;
	
	private FlyweightFactory() {
		flyweightPool = new HashMap<>();
	}
	
	public static FlyweightFactory getInstance() {
		if(flyweightFactory==null) {
			flyweightFactory = new FlyweightFactory();
		}
		return flyweightFactory;
	}
	
	public Flyweight getFlyweight(String key) {
		if(flyweightPool.containsKey(key))
			return flyweightPool.get(key);
		else {
			Flyweight flyweight;
			if("add".equals(key)) 
				flyweight = new FlyweightAdd();
			else
				flyweight = new FlyweightMultiply();	
			
			flyweightPool.put(key, flyweight);
			return flyweight;
		}	
	}
}
