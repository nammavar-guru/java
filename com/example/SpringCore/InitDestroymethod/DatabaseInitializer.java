package com.example.SpringCore.InitDestroymethod;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer {

	private List<User> userList = new ArrayList<>();
	
	
	public void init() {
		
		System.out.println("Initialization");
		
		User user1 = new User(1,"Guru");
		User user2 = new User(2,"Nikhil");
		userList.add(user1);
		userList.add(user2);
		for (User u:userList) {
			System.out.println(u.toString());
		}
	}
	
	
	public void destroy() {
		System.out.println("Destroy");
		userList.clear();
		for (User u:userList) {
			System.out.println(u.toString());
		}
	}
}
