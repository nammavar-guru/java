package com.example.core.collection.map;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdentityHashMap<Integer,String> ihm= new IdentityHashMap();
		ihm.put(new Integer(1), "Guru");
		ihm.put(new Integer(1), "Mangai");
		ihm.put(new Integer(1), "Kumaresh");
		ihm.put(new Integer(1), "Nikhilan");
		ihm.put(1, "Guru Murugesan");
		
		System.out.println(ihm);
		System.out.println("Size:"+ihm.size());
		System.out.println("ihm.get(1)"+ihm.get(1));
		
		System.out.println("Iteration 1");
		for(Entry<Integer,String> entry : ihm.entrySet()) {
			System.out.println("Key :"+entry.getKey()+" value :"+entry.getValue());
		}
		
		System.out.println("Iteration 2");
		Iterator itr = ihm.entrySet().iterator();
		while(itr.hasNext()) {
			Entry entry = (Entry) itr.next();
			System.out.println("Key :"+entry.getKey()+" value :"+entry.getValue());
		}
		
		
		for(Integer in : ihm.keySet()) {
			System.out.println("Key :"+in.intValue());
		}
		
		for(Map.Entry<Integer,String> entry : ihm.entrySet()) {
			System.out.println("Key :"+entry.getKey()+" value :"+entry.getValue());
		}

	}

}
