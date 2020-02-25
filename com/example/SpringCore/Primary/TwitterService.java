package com.example.SpringCore.Primary;

import org.springframework.stereotype.Service;

@Service("TwitterService")
public class TwitterService implements MessageService {
	public void sendMessage(String message) {
		System.out.println("Twitter service message");
	}

}
