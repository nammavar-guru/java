package com.example.SpringCore.Primary;

import org.springframework.stereotype.Service;

@Service("EmailService")
public class EmailService implements MessageService {
	public void sendMessage(String message) {
		System.out.println("EmailService message");
	}
}
