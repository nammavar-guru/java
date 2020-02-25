package com.example.SpringCore.Qualifier;

import org.springframework.stereotype.Service;

@Service("SMSService")
public class SMSService implements MessageService {
	public void sendMessage(String message) {
		System.out.println("SMS Service message");
	}
}
