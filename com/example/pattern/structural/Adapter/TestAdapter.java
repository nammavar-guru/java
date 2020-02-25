package com.example.pattern.structural.Adapter;

public class TestAdapter {
public void voltTo6VoltAdapter(int volt) {
	if(volt > 6) {
		if(volt == 12) {
			Input12Volt i22volt = new Input12Volt();
			i22volt.inputVolt(volt);
			int v= 6;
			i22volt.inputVolt(v);
		}
	}
}
	public static void main(String[] args) {
		TestAdapter ta = new TestAdapter();
		inputVolt inputVolt1 = new Input6Volt();
		inputVolt inputVolt2 = new Input6Volt();
		ta.voltTo6VoltAdapter(12);
	}
}
