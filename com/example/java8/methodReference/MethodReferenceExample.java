package com.example.java8.methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class MethodReferenceExample {

	 
	 
	public static void main(String[] args) {
		List<User> userList = Arrays.asList(new User("Guru","Murugesan"), new User("a","b"), new User("x","z") );
		System.out.println("Users List"+userList);
		CompareTest co = new CompareTest();
		userList.stream()
		.filter((use->use.firstName.equals("Guru")))
		.forEach(user->{
			System.out.println("Stream First Name"+user.firstName);
			System.out.println("Stream Last Name"+user.lastName);
		});
		
		userList.forEach(user->{
			System.out.println("For Each First Name"+user.firstName);
			System.out.println("For Each Last Name"+user.lastName);
		});
		
		Collections.sort(userList, co::compareByFirstName);
		System.out.println("Users List - After Comparator"+userList);
		userList.stream().forEach(user->{
			System.out.println("First Name"+user.firstName);
			System.out.println("Last Name"+user.lastName);
		});
		
		Iterator<User> itr= userList.listIterator();
		System.out.println("");
		System.out.println("1-Users List - Iterator");
		while(itr.hasNext()) {
			User us = (User)itr.next();
			System.out.println("First Name"+us.firstName);
			System.out.println("Last Name"+us.lastName);
			
		}
		
		System.out.println("");
		System.out.println("2-Users List");
		int j=0;
		while(j<userList.size()) {
			User us = (User)userList.get(j);
			System.out.println("First Name"+us.firstName);
			System.out.println("Last Name"+us.lastName);
			j++;
		}
		
		System.out.println("");
		System.out.println("3 - for User List");
		for(User us:userList) {
			System.out.println("First Name"+us.firstName);
			System.out.println("Last Name"+us.lastName);
		}
		
		System.out.println("");
		System.out.println("4 - forEach User List");
		userList.forEach(us-> {
			System.out.println("First Name"+us.firstName);
			System.out.println("Last Name"+us.lastName);
		});
		
		System.out.println("");
		System.out.println("5 - Stream forEach User List");
		userList.stream().filter(us->us.firstName.equals("Guru"))
		.forEach(us-> {
			System.out.println("First Name"+us.firstName);
			System.out.println("Last Name"+us.lastName);
		});
		
		List<String> firstName = userList.stream().map(x->x.firstName).collect(Collectors.toList());
		System.out.println("List First Name -->"+firstName);
		
		userList.forEach(System.out::println);
	}

}
