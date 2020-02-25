package com.example.core.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> tm= new TreeMap<>();
		tm.put("Sunday", 1);
		tm.put("Monday",2 );
		tm.put("Tuesday", 3);
		tm.put("Wednesday", 4);
		tm.putIfAbsent("Thrusday", 5);
		if(!tm.containsKey("Friday"))
			tm.put("Friday", 6);
		
		if(!tm.containsValue(7))
			tm.put("Saturday",7 );	
		
		if(!tm.isEmpty()) {
		System.out.println("Tree map shows the data insertion order");
		System.out.println(tm);
		}
		
		System.out.println("Tree Map Size "+tm.size());
		System.out.println("Tree Map get 4 :"+tm.get("Wednesday"));
		System.out.println("Tree Map get 8 :"+tm.get("July"));
		
		System.out.println("Tree Map  firstKey:"+tm.firstKey());
		System.out.println("Tree Map  firstEntry:"+tm.firstEntry());
		
		System.out.println("Tree Map  lastKey:"+tm.lastKey());
		System.out.println("Tree Map  lasstEntry:"+tm.lastEntry());
		
		System.out.println("Tree Map  lowerEntry:"+tm.lowerEntry("Saturday"));
		
		System.out.println("Tree Map  higherEntry:"+tm.higherEntry("Saturday"));
		
		
		System.out.println("Tree Map Iterating lambda Expression");
		tm.forEach((k,v)->System.out.println("Key :"+k+ " :value :"+v));
		
		System.out.println("Tree Map Iterating using EntrySet lambda Expression");
		tm.entrySet().forEach((e)->System.out.println("Key"+e.getKey()+" Value: "+e.getValue()));
		
		
		System.out.println("Tree Map Iteration");
		Iterator<Map.Entry<String,Integer>> itr = tm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String,Integer> entry = itr.next();
			System.out.println("Key"+entry.getKey()+" Value: "+entry.getValue());
		}
		
		System.out.println("Tree Map Iteration");
		Iterator<Entry<String,Integer>> it = tm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String,Integer> entry = it.next();
			System.out.println("Key"+entry.getKey()+" Value: "+entry.getValue());
		}
		
		System.out.println("Tree Map KeySet Iteration");
		Iterator<String> i = tm.keySet().iterator();
		while(i.hasNext()) {
			String key = i.next();
			System.out.println("Key"+key+" Value: "+tm.get(key));
		}
	}

}
