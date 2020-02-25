package com.example.core.binding.dynamicbinding;

public class DynamicBinding {

	public static void main(String args[]) {
		P a = new P();
		a.method();
		
		C c = new C();
		c.method();
		
		P b = new C();
		b.method();
	}
}
