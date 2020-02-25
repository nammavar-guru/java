package com.example.SpringCore.InitDestroymethod;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class DatabaseInitializer2 {

	private List<User> userList = new ArrayList<>();
	BeanA beana;

	public DatabaseInitializer2() {}
	
	public void init() {
		
		System.out.println("Initialization");
		
//		User user1 = new User(1,"Guru");
//		User user2 = new User(2,"Nikhil");
//		userList.add(user1);
//		userList.add(user2);
//		for (User u:userList) {
//			System.out.println(u.toString());
//		}
		
		beana.methodA();
	}
	
	
	public void destroy() {
		System.out.println("Destroy");
//		userList.clear();
//		for (User u:userList) {
//			System.out.println(u.toString());
//		}
	}
	
	@Autowired
	@Required
	public void setBeanA(BeanA beanA) {
		this.beana=beanA;
	}
	
	@Bean(initMethod="init",destroyMethod="destroy")
	public BeanA beanA() {
		return new BeanA();
	}
}
