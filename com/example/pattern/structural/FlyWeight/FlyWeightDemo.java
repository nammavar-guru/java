package com.example.pattern.structural.FlyWeight;

public class FlyWeightDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlyweightFactory fwf = FlyweightFactory.getInstance();
		
		for(int i=0;i<5;i++) {
			Flyweight fw = fwf.getFlyweight("add");
			fw.doMath(i, i);
		}
		
		for(int i=0;i<5;i++) {
			Flyweight fw = fwf.getFlyweight("multiply");
			fw.doMath(i, i);
		}
		
	}

}
