package com.example.pattern.behavioral.state;

public class StatePattern {

	public static void main(String[] args) {
		AlertStateContext stateContext = new AlertStateContext();
		stateContext.setState(new Silent());
		stateContext.alert();
		stateContext.alert();
		stateContext.setState(new Vibration());
		stateContext.alert();
		stateContext.alert();
		

	}

}
