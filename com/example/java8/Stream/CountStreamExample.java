package com.example.java8.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountStreamExample {
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
		names.add("Guru");
		names.add("Kumaresh");
		names.add("Guru");
		
		long count = names.stream().filter(s->s.length()>=5).count();
		System.out.println("Count: "+count);
		
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted Names: "+sortedNames);
		
		List<String> distinctNamest = names.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("Distinct Names: "+distinctNamest);
		
		names.stream().distinct().forEach(System.out::print);
		
		List<Integer> n = Arrays.asList(2,3,4,5);
		Stream<Integer> numberStream = n.stream();
		numberStream.forEach(System.out::println);
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println("\nSquare List :"+square);
		
		List<Integer> numberList = Arrays.asList(2,3,4,5);
		Set<Integer> squareSet = numberList.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println("Square Set :"+square);
		
		List<Integer> reduceList = Arrays.asList(2,3,4,2);
		int reduceNumber = reduceList.stream().reduce(1, (x,y)-> x*y);
		System.out.println("reduceNumber :"+reduceNumber);
		
		
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		long counts = strings.stream().filter(s->s.isEmpty()).count();	
		System.out.println("counts :"+counts);
		List<String> filteredString = strings.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
		System.out.println("Actual String :"+strings);
		System.out.println("filteredString :"+filteredString);
		List<String> limitString = strings.stream().limit(5).collect(Collectors.toList());
		System.out.println("limitString :"+limitString);
		
		
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());
		
		Stream<Date> stream = Stream.generate(() -> { return new Date(); }).limit(1);
        stream.forEach(p -> System.out.println("Stream Generate Date :"+p));
		
        List<String> stringList = Arrays.asList("abc", "zxx", "bc", "efg", "abcd","a", "jkl");
        List<String> reverseStringList = stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("reverseStringList :"+reverseStringList);
		
	}

}
