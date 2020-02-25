package com.example.pattern.behavioral.state;

public class Silent implements MobileAlertState {

	public void alert() {
		System.out.println("Silent Alert");
	}
}
