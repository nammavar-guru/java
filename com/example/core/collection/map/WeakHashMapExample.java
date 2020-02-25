package com.example.core.collection.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) throws Exception {
		WeakHashMap<Integer,String> whm = new WeakHashMap<>();
		Integer i10 = new Integer(10);
		Integer i5 = new Integer(5);
		whm.put(i10, "Ten");
		whm.put(i5, "Five");
		System.out.println("Weak Hash MAp"+whm);
		i10 = null;
		i5=null;
		
		System.gc();
		System.out.println("After GC Weak Hash MAp"+whm);
		
		HashMap<Integer,String> hm = new HashMap<>();
		Integer hi10 = new Integer(10);
		Integer hi5 = new Integer(5);
		hm.put(hi10, "Ten");
		hm.put(hi5, "Five");
		System.out.println("Hash MAp"+hm);
		hi10 = null;
		hi5=null;
		
		System.gc();
		System.out.println("After GC Hash MAp"+hm);
	}

}
