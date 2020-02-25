package com.example.java8.Stream;

import java.util.stream.Stream;

public class StreamBuilderExample {

	public static void main(String[] args) {

		Stream.Builder<String> builder = Stream.builder();
		
		builder.add("first")
			   .add("second")
			   .add("third");
		
		Stream<String> stream = builder.build();
		stream.forEach(System.out::print);
	}

}
