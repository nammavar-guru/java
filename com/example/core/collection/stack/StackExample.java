package com.example.core.collection.stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverseString = "Gurunathan";
		System.out.println("Initial String "+ reverseString);
		
		char rc[] = reverseString.toCharArray();
		//char newrc[] = new char[reverseString.length()];
		
		Stack stack = new Stack();
		for(int i=0;i<reverseString.length();i++) {
			stack.push(rc[i]);
		}
		
		for(int i=0;i<reverseString.length();i++) {
			rc[i] = (char) stack.pop();
		}
		
		System.out.println("Reverse String "+String.valueOf(rc));
	}

}
