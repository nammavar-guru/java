package com.example.core.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModificationMultipleThread extends Thread {
	static ConcurrentHashMap<Integer,String> chm = new ConcurrentHashMap<>();
	//static HashMap<Integer,String> chm = new HashMap<>();
	public void run() {
		try {
			Thread.sleep(2000);
			chm.put(103, "guru");
			
		}catch(InterruptedException e) {
			System.out.println("Hash map is updating by Child Thread");
			chm.put(103, "guru");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		chm.put(101, "Kumaresh");
		chm.put(102, "nikhil");
		
		ConcurrentModificationMultipleThread myThread = new ConcurrentModificationMultipleThread();
		myThread.start();
		
		Set<Integer> s = chm.keySet();
		Iterator<Integer> itr = s.iterator();
		while(itr.hasNext()) {
			Integer i =(Integer)itr.next();
			System.out.println("Manin thread entry is"+ i +" :"+chm.get(i));
			Thread.sleep(3000);
		}
		
		System.out.println("Concurrent Hash Map"+chm);
		}
	}

