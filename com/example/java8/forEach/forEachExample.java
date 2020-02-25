package com.example.java8.forEach;

import java.util.HashMap;
import java.util.Map;

public class forEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> namesMap = new HashMap<>();
		namesMap.put(1, "Larry");
		namesMap.put(2, "Steve");
		namesMap.put(3, "James");
		namesMap.forEach((k,v)->System.out.println("Key :"+k+" Value: 	"+v));
		System.out.println("");
		namesMap.entrySet().forEach(e->System.out.println("Key :"+e.getKey()+" Value: 	"+e.getValue()));
	}

}
