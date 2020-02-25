package com.example.java8.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionComparatorLambdaExpExample {

	public static void main(String args[]) {
		
		List<Integer> li = new ArrayList<>();
		li.add(20);
		li.add(10);
		li.add(5);
		li.add(80);
		li.add(70);
		li.add(1);
		System.out.println(li);
		Comparator<Integer> casc = (i1,i2) ->(i1<i2)?-1:(i1>i2)?+1:0;
		Comparator<Integer> cdes = (i1,i2) ->(i1>i2)?-1:(i1<i2)?+1:0;
		Collections.sort(li, casc);
		System.out.println("Lambda Expression After Sorting - Ascending : "+li);
		Collections.sort(li, cdes);
		System.out.println("Lambda Expression After Sorting - Descending : "+li);
		li.stream().forEach(System.out::println);
		
		List<Integer> liLa = li.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers : "+liLa);
		
		
	}
}
