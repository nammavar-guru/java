package com.example.core.collection.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "guru");
		hm.put(2, "kumaresh");
		hm.put(3, "nikhilan");
		
		System.out.println("hm.get(1)"+hm.get(1));
		hm.put(1, "GURUNATHan");
		System.out.println("hm.get(1)"+hm.get(1));
		hm.remove(1);
		System.out.println("hm.get(1)"+hm.get(1));
		System.out.println("hm.containsKey(1)"+hm.containsKey(1));
		System.out.println("hm.containsValue(\"kumaresh\")"+hm.containsValue("kumaresh"));
		
		Iterator itr = (Iterator)hm.keySet().iterator();
		while(itr.hasNext()) {
			int itrvalue = (Integer)itr.next();
			System.out.println("itrvalue"+itrvalue);
		}
		
		Iterator iv = (Iterator)hm.values().iterator();
		while(iv.hasNext()){
			String values = (String)iv.next();
			System.out.println("values"+values);
		}
		
		Iterator es = (Iterator)hm.entrySet().iterator();
		while(es.hasNext()) {
			Map.Entry me = (Map.Entry)es.next();
			System.out.println("Key"+me.getKey()+ " value:"+me.getValue());
		}
		
		Set<Entry<Integer,String>> en = hm.entrySet();
		for(Entry<Integer, String> s :en) {
			System.out.println("key"+s.getKey() + " value"+s.getValue());
		}
		
	
		for(Map.Entry<Integer, String> me:hm.entrySet()) {
			System.out.println("key"+me.getKey() + " value"+me.getValue());
					
		}
		System.out.println("hm.get(2)"+hm.get(2));
		hm.clear();
		System.out.println("hm.get(2)"+hm.get(2));
		
		
	}

}
