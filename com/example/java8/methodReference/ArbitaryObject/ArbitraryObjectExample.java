package com.example.java8.methodReference.ArbitaryObject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;

public class ArbitraryObjectExample {

	public static void main(String[] args) {

		List<String> messages = Arrays.asList("hello", "baeldung", "readers!");
		messages.forEach(word -> StringUtils.capitalize(word));
		System.out.println("Lambda Expression :" + messages);
		messages.forEach(StringUtils::capitalize);
		System.out.println("Method Reference :" + messages);

		List<String> strings = Arrays.asList("how", "to", "do", "in", "java", "dot", "com");

		List<String> sorted = strings.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());

		System.out.println(sorted);

		List<String> sortedAlt = strings.stream().sorted(String::compareTo).collect(Collectors.toList());

		System.out.println(sortedAlt);
	}

}
