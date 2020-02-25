package com.example.core.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample {

	public static void main(String[] args) {
		ConcurrentHashMap chm = new ConcurrentHashMap();
		
		HashMap<String,String> hm = new HashMap<>();
		hm.put("guru", "Murugesan");
		System.out.println(hm.get("guru"));
		
		hm.put("null","testnull");
		System.out.println(hm.get("null"));
		hm.put("test","tes");
		
		Iterator<String> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			String key = itr.next();
			//if(key.equals("null"))
				hm.put("new","new");
				//hm.put("test","new");
			
		}
	}

}
