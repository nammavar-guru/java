package com.example.SpringCore.Qualifier;

import org.springframework.stereotype.Service;

@Service("TwitterService")
public class TwitterService implements MessageService {
	public void sendMessage(String message) {
		System.out.println("Twitter service message");
	}

}
