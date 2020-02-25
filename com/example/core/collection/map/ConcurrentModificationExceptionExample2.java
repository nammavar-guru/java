package com.example.core.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class ConcurrentModificationExceptionExample2 {
		public static void main(String args[]) {
			List<String> myList = new ArrayList<String>();
			myList.add("1");
			myList.add("2");
			myList.add("3");
			myList.add("4");
			myList.add("5");
			Iterator<String> it = myList.iterator();
			while (it.hasNext()) {
				String value = it.next();
				System.out.println("Iterator Value:" + value);
				if (value.equals("3")) {
				//	myList.remove(value); // Java.util.ConcurrentModificationException
					it.remove(); //It allows remove operation through iterator
				}	
			}
			System.out.println("Iterator List :" +myList);
			
			ListIterator<String> lit = myList.listIterator();
			while (lit.hasNext()) {
				String value = lit.next();
				System.out.println("List Iterator Value:" + value);
				if (value.equals("2")) {
					lit.remove();
				}	
			}

			System.out.println("List Iterator List :" +myList);
			
			Map<String, String> myMap = new HashMap<String, String>();
			myMap.put("1", "1");
			myMap.put("2", "2");
			myMap.put("3", "3");

			Iterator<String> it1 = myMap.keySet().iterator();
			while (it1.hasNext()) {
				String key = it1.next();
				System.out.println("Map Value:" + myMap.get(key));
				if (key.equals("2")) {
					myMap.put("1", "4"); // for already existing key, it doesn't throw any exception
//					myMap.put("4", "4"); //Concurrent modificationException occurs while adding the data.
					it1.remove(); // allows remove through iteration
//					myMap.remove("2"); // ConcurrentModificationException occurs while removing data
					 
				}
			}
			
			System.out.println("Map Iterations List :" +myMap);
		}
	}

