package com.example.core.collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class ArrayListExample {
	
	public static void main(String args[]) {
		//List<String> al = Arrays.asList("Apple","Lemon","Bananna","Orange","Musambi");
		List<String> al = new ArrayList<>();
		al.add("Apple");
		al.add("Lemon");
		al.add("Bannana");
		al.add("Orange");
		al.add("Musambi");
		
		System.out.println("Print List "+al);
		al.set(2, "Lemondate");
		System.out.println("set 2 lemondate "+al);
		al.add(4, "papaya");
		System.out.println("Add 4 Papaya "+al);
		System.out.println("get 4 "+al.get(4));
		al.remove(1);
		System.out.println("Remove index 1 "+al);
		al.remove("papaya");
		System.out.println("Remove Papaya "+al);
		
		System.out.println("index of apple "+al.indexOf("Apple"));
		System.out.println("last index of apple "+al.lastIndexOf("Apple"));
		System.out.println("contains of apple "+al.contains("Apple"));
				
		al.forEach(l->System.out.print(l+" "));
		System.out.println("");
		
		for(String l:al) {
			System.out.print(l+" ");
		}
		
		System.out.println("");
		Iterator<String> itr =  al.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	}
}
