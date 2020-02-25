package com.example.java8.methodReference;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MethodReferenceMapExample {

	public static void main(String... args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Guru", 1);
		map.put("Mangai", 2);
		map.put("Kumaresh", 3);
		map.put("nikhil", 4);
		System.out.println("For Each Itereation");
		// BiConsumer
		map.forEach((k, v) -> System.out.println("Key:" + k + "Value:" + v));

		System.out.println("-------------------------------------------");
		System.out.println("For Each entry set Itereation");
//Consumer
		map.entrySet()
				.forEach(entry -> System.out.println("Entry Key" + entry.getKey() + " Value:" + entry.getValue()));
		System.out.println("-------------------------------------------");
		System.out.println("For Each Key Set Itereation");
		map.keySet().forEach(key -> System.out.println("Entry Key" + key));
		System.out.println("-------------------------------------------");
		System.out.println("For Each Value Set Itereation");
		map.values().forEach(value -> System.out.println("Entry values" + value));
		System.out.println("-------------------------------------------");

		System.out.println("");
		System.out.println("1 -Iterator Map Example");
		Iterator<Map.Entry<String, Integer>> itr = (Iterator) map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, Integer> me =(Entry<String, Integer>) itr.next();
			System.out.println("Key:"+me.getKey()+"Value:"+me.getValue());
		}
		
		System.out.println("");
		System.out.println("2 -for Map Example");
		for (Entry<String, Integer> values : map.entrySet()) {
			System.out.println("for loop key" + values.getKey() + "for Loop get value:" + values.getValue());
		}
		
		System.out.println("");
		System.out.println("3 -forEach Map Example");
		map.forEach((k,v)->System.out.println("for loop key" + k.toUpperCase() + "value:" + v));
		
		System.out.println("");
		System.out.println("4 -forEach Map Example");
		map.entrySet().forEach(e->System.out.println("for loop key" + e.getKey() + "value:" + e.getValue()));
		
		System.out.println("");
		System.out.println("5 -forEach Map - Key Example");
		map.keySet().forEach(e->System.out.println("for loop key" + e +"for loop value" + map.get(e)));
		
		System.out.println("");
		System.out.println("5 -forEach Map - Values Example");
		map.values().forEach(e->System.out.println("for each value" + e));
		
		System.out.println("");
		System.out.println("6 -stream forEach  Map Example");
		map.entrySet().stream().filter(k->k.getKey().equals("Guru"))
		.forEach(e->System.out.println("for loop key" +e.getKey() + "value:" + e.getValue()));
	}
}
