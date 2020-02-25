package com.example.SpringCore.Primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("SMSService")
@Primary
public class SMSService implements MessageService {
	public void sendMessage(String message) {
		System.out.println("SMS Service message");
	}
}
