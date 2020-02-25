package com.example.core.collection.map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
	public enum Days{
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
	}
	public static void main(String[] args) {
		Map<Days,Integer> em = new EnumMap<Days,Integer>(Days.class);
			em.put(Days.Monday, 1);
			em.put(Days.Tuesday, 2);
			em.put(Days.Wednesday, 3);
			
			System.out.println("em.get(Days.Monday)"+em.get(Days.Monday));
			System.out.println("em.get(Days.Thursday)"+em.get(Days.Thursday));

	}

}
