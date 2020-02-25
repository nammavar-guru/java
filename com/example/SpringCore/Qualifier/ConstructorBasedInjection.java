package com.example.SpringCore.Qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorBasedInjection {
	private MessageService messageService;
	
	public ConstructorBasedInjection(@Qualifier("TwitterService") MessageService service) {
		super();
		this.messageService = service;
	}
	
	public void processMessage(String message) {
		messageService.sendMessage("test");
	}
}
