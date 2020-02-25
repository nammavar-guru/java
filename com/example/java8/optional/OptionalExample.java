package com.example.java8.optional;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		User user = new User();
		Optional<User> userOption = Optional.of(user);
		userOption.ifPresent(c->System.out.println("User is Present"));
		
//		User user1 = null;
//		Optional<User> userOption1 = Optional.of(user1);
//		userOption1.ifPresent(c->System.out.println("User is Present"));

		Optional<String> opt = Optional.of("MALE");
		System.out.println("Non Empty Optional :"+opt);
		System.out.println("Non Empty Optional -Gender value:"+opt.get());
		System.out.println("Empty Optional :"+opt.empty());
		System.out.println("isPresent Optional :"+opt.isPresent());
		
		Optional<String> empty =Optional.empty();
		//System.out.println("Empty Optional:"+empty.get());//Compile Time Error
		System.out.println("Empty is Present :"+empty.isPresent());
		opt.ifPresent(s->System.out.println("String Length :"+s.length()));
		
		String nullName = null;
		String name = Optional.ofNullable(nullName).orElse("Guru");
		System.out.println("orElse Name :"+name);
		name = Optional.ofNullable(nullName).orElseGet(()->"Gurunathan");
		System.out.println("orElseGet Name :"+name);
		
		//String nameException = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
		//System.out.println("nameException :"+nameException);
		
		
		String answer1 ="Yes";
		String answer2= null;
		String ans1 = Optional.ofNullable(answer1).get();
		//String ans1 = Optional.ofNullable(answer1).orElse("YesElse");
		System.out.println("ans1 :"+ ans1);
		System.out.println("answer1 :"+Optional.ofNullable(answer1));
		System.out.println("answer2 :"+Optional.ofNullable(answer2));
		//NullPointerException
		//System.out.println("answer2"+Optional.of(answer2));
		System.out.println("");
	}

}
