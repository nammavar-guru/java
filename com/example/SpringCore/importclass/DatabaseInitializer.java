package com.example.SpringCore.importclass;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

public class DatabaseInitializer {

	private List<User> userList = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		
		System.out.println("Initialization");
		
		User user1 = new User(1,"Guru");
		User user2 = new User(2,"Nikhil");
		userList.add(user1);
		userList.add(user2);
		for (User u:userList) {
			System.out.println(u.toString());
		}
		System.out.println("forEach Block");
		userList.forEach(u->System.out.println(u));
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy");
		userList.clear();
		for (User u:userList) {
			System.out.println(u.toString());
		}
	}
}
