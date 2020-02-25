package com.example.core.collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> lhm= new LinkedHashMap<>();
		lhm.put("Sunday", 1);
		lhm.put("Monday",2 );
		lhm.put("Tuesday", 3);
		lhm.put("Wednesday", 4);
		lhm.putIfAbsent("Thrusday", 5);
		if(!lhm.containsKey("Friday"))
			lhm.put("Friday", 6);
		
		if(!lhm.containsValue(7))
			lhm.put("Saturday",7 );	
		
		if(!lhm.isEmpty()) {
		System.out.println("Linked Hash map shows the data insertion order");
		System.out.println(lhm);
		}
		
		System.out.println("Linked HashMap Size "+lhm.size());
		System.out.println("Linked HashMap get 4 :"+lhm.get("Wednesday"));
		System.out.println("Linked HashMap get 8 :"+lhm.get("July"));
		
		
		System.out.println("Linked HashMap Iterating lambda Expression");
		lhm.forEach((k,v)->System.out.println("Key :"+k+ " :value :"+v));
		
		System.out.println("Linked HashMap Iterating using EntrySet lambda Expression");
		lhm.entrySet().forEach((e)->System.out.println("Key"+e.getKey()+" Value: "+e.getValue()));
		
		
		System.out.println("Linked HashMap Iteration");
		Iterator<Map.Entry<String,Integer>> itr = lhm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String,Integer> entry = itr.next();
			System.out.println("Key"+entry.getKey()+" Value: "+entry.getValue());
		}
		
		System.out.println("Linked HashMap Iteration");
		Iterator<Entry<String,Integer>> it = lhm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String,Integer> entry = it.next();
			System.out.println("Key"+entry.getKey()+" Value: "+entry.getValue());
		}
		
		System.out.println("Linked HashMap KeySet Iteration");
		Iterator<String> i = lhm.keySet().iterator();
		while(i.hasNext()) {
			String key = i.next();
			System.out.println("Key"+key+" Value: "+lhm.get(key));
		}
		System.out.println("Linked HashMap Iterating lambda Expression");
	}

}
