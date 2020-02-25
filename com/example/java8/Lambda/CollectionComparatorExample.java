package com.example.java8.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MyComparator implements Comparator<Integer>{
public int compare(Integer i1, Integer i2) {
	return (i1<i2)?-1:(i1>i2)?+1:0;
}
}

class MyComparatorDesc implements Comparator<Integer>{
public int compare(Integer i1, Integer i2) {
	return (i1>i2)?-1:(i1<i2)?+1:0;
}
}

public class CollectionComparatorExample {

	public static void main(String args[]) {
		
		List<Integer> li = new ArrayList<>();
		li.add(20);
		li.add(10);
		li.add(5);
		li.add(80);
		li.add(70);
		li.add(1);
		System.out.println(li);
		Collections.sort(li, new MyComparator());
		System.out.println("After Sorting - Ascending : "+li);
		Collections.sort(li, new MyComparatorDesc());
		System.out.println("After Sorting - Descending : "+li);
		
	}
}
