package com.example.core.collection.map.HashMapCustom;

public class HashMapCustomExample {

	public static void main(String[] args) {

		HashMapCustom<Integer,String> hm = new HashMapCustom();
		hm.put(1,"guru");
		hm.put(2,"Nikhil");
		hm.put(3,"Kumaresh");
		hm.put(4,"Managai");
		hm.put(1,"gurunathan");
		hm.put(5,"Thiyagu");
		hm.put(6,"janani");
		hm.put(7, "test");
		hm.put(8, "testa");
		hm.put(9, "testb");
		
		hm.display();
		
		System.out.println("get(1): "+hm.get(1));
		System.out.println("get(2): "+hm.get(2));
		System.out.println("get(3): "+hm.get(3));
		System.out.println("get(4): "+hm.get(4));
		System.out.println("get(5): "+hm.get(5));
		System.out.println("get(6): "+hm.get(6));
		System.out.println("get(7): "+hm.get(7));
		System.out.println("get(8): "+hm.get(8));
		System.out.println("get(9): "+hm.get(9));
		System.out.println("get(10): "+hm.get(10));
	}

}
