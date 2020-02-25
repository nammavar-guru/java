package com.example.core.collection.map;

public class Recursion {
	public static int recursion(int n) {
		
		if (n>1) {
			n = recursion(n- 1);
		}	
		return n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(recursion(25));
		

	}

}
