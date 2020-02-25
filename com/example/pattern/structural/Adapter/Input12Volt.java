package com.example.pattern.structural.Adapter;

public class Input12Volt implements inputVolt {
	public void inputVolt(int volt) {
		System.out.println("12Volt"+volt);
	}
}
