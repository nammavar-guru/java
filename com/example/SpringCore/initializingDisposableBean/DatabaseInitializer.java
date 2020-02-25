package com.example.SpringCore.initializingDisposableBean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializer implements InitializingBean, DisposableBean {

	private List<User> userList = new ArrayList<>();
	
	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("Initialization");
		
		User user1 = new User(1,"Guru");
		User user2 = new User(2,"Nikhil");
		userList.add(user1);
		userList.add(user2);
		for (User u:userList) {
			System.out.println(u.toString());
		}
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroy");
		userList.clear();
		for (User u:userList) {
			System.out.println(u.toString());
		}
	}
}
