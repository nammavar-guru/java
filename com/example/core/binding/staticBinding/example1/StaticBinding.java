package com.example.core.binding.staticBinding.example1;

public class StaticBinding {

	public static void main(String args[]) {
		C c = new C();
		c.method();
		
		P b = new C();
		b.method();
		
		P a = new P();
		a.method();
		
		P a1= null;
		a1.method();
		
		P a2;
		//a2.method(); //Compile Time Error - Local variables may not have been initialized 
		
		
	}
}
