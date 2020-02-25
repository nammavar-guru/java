package com.example.core.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapBasicExample {

	public static void main(String[] args) {
		HashMap<String, String> hm  = new HashMap<>();
		hm.put("key1","value1");
		hm.put("key2","value2");
		hm.put("key3","value3");
		
		//Set<Entry<String, String>> mapEntry = hm.entrySet();
		//Map.Entry<String, String> mapEntry = hm.entrySet();
		System.out.println("Example1");
		System.out.println("ForEach(k,v) Loop");
		hm.forEach((k,v)-> {
			System.out.println("Key:"+k+ " Value:"+v);
		});
		
//		Example1
//		ForEach(k,v) Loop
//		Key:key1 Value:value1
//		Key:key2 Value:value2
//		Key:key3 Value:value3

		System.out.println("Example2.a");
		System.out.println("ForEach(k,v) Loop");
		hm.entrySet().forEach((e)-> {
			System.out.println("Key:"+e.getKey()+ " Value:"+e.getValue());
		});
		
//		Example2.a
//		ForEach(k,v) Loop
//		Key:key1 Value:value1
//		Key:key2 Value:value2
//		Key:key3 Value:value3
		
		System.out.println("Example2.b");
		System.out.println("\n"+"Stream forEach(e) loop");
		hm.entrySet().stream().forEach(e -> {
			System.out.println("Key:"+e.getKey()+ " Value:"+e.getValue());
			
		});
		
//		Example2.b
//
//		Stream forEach(e) loop
//		Key:key1 Value:value1
//		Key:key2 Value:value2
//		Key:key3 Value:value3

		System.out.println("Example3");	
		System.out.println("\n"+"for Map.Entry loop");
		for(Map.Entry<String, String> pair:hm.entrySet()) {
			System.out.println("Key:"+pair.getKey()+ " Value:"+pair.getValue());
			
		}
		
//		Example3
//
//		for Map.Entry loop
//		Key:key1 Value:value1
//		Key:key2 Value:value2
//		Key:key3 Value:value3
		
		System.out.println("Example4");
		System.out.println("\n"+"for Entry for Loop");
		//Set<Entry<String,String>> entrySet = hm.entrySet();
		//for(Entry<String,String> pair:entrySet) {
		for(Entry<String,String> pair:hm.entrySet()) {
		System.out.println("Key:"+pair.getKey()+ " Value:"+pair.getValue());
		}

//		Example4
//
//		for Entry for Loop
//		Key:key1 Value:value1
//		Key:key2 Value:value2
//		Key:key3 Value:value3
		
		System.out.println("Example5");
		System.out.println("\n"+"KeySet for Loop");
		for(String key :hm.keySet()) {
			System.out.println("key"+key +" Value:"+hm.get(key));
		}
		
//		Example5
//
//		KeySet for Loop
//		keykey1 Value:value1
//		keykey2 Value:value2
//		keykey3 Value:value3
		
		System.out.println("Example6");
		System.out.println("\n"+"EntrySet Iterator Map.Entry  ");
		Iterator<Map.Entry<String,String>> itr = hm.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String>  	entry = itr.next();
			System.out.println("Key:"+entry.getKey()+ " Value:"+entry.getValue());
		}
//		Example6
//
//		EntrySet Iterator Map.Entry  
//		Key:key1 Value:value1
//		Key:key2 Value:value2
//		Key:key3 Value:value3
		
		System.out.println("Example7");
		System.out.println("\n"+"EntrySet Iterator Entry  ");
		Iterator<Entry<String,String>> i = hm.entrySet().iterator();
		while(i.hasNext()) {
			Entry<String, String>  	entry = i.next();
			System.out.println("Key:"+entry.getKey()+ " Value:"+entry.getValue());
		}
		
//		Example7
//
//		EntrySet Iterator Entry  
//		Key:key1 Value:value1
//		Key:key2 Value:value2
//		Key:key3 Value:value3
		
		System.out.println("Example8");
		System.out.println("\n"+"KeySet Iterator");
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key"+key +" Value:"+hm.get(key));
		}
//		Example8
//
//		KeySet Iterator
//		keykey1 Value:value1
//		keykey2 Value:value2
//		keykey3 Value:value3		
		
		
	}

}
