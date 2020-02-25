package com.example.pattern.behavioral.state;

public class AlertStateContext {
	private MobileAlertState currentState;
	
	public AlertStateContext() {
		currentState = new Vibration();
	}
	
	public void setState(MobileAlertState state) {
		currentState = state;
	}
	//call the alert based on the setState
	public void alert() {
		currentState.alert();
	}
}
