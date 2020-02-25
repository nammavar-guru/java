package com.example.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Adam","Alexandar","John","Kumaresh","Nikhilan");
		
		Predicate<String> predicate1 = str ->str.startsWith("K");
		Predicate<String>  predicate2 = str-> str.length() > 5;
		
		List<String> filterList = names.stream().filter(predicate1.and(predicate2)).collect(Collectors.toList());
		
		List<String> filterList2 = names.stream().filter(predicate2	).collect(Collectors.toList());
		
		List<String> filterList3 = names.stream().filter(str->str.startsWith("K")).collect(Collectors.toList());
		
		filterList3.forEach(name->{ System.out.println("Name: "+name);});
	}

}
