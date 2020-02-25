package com.example.DataStructure.stack;

public class LinkedListStack {
	private Node head;
	
	private class Node {
		int data;
		Node next;
	}
	
	public LinkedListStack() {
		head =null;
	}
	
	public void push(int data) {
		Node temp = head;
		head = new Node();
		head.data = data;
		head.next= temp;
		
		System.out.println("push element :"+head.data);
	}
	
	public int pop() {
		if(head == null) {
			System.out.println("Stack is Empty");
		}
		int data = head.data;
		head = head.next;
		System.out.println("Popped element :"+data);
		return data;
	}
	
	public int top() {
		if(head == null) {
			System.out.println("Stack is Empty");
		}
		int data = head.data;
		System.out.println("top element :"+data);
		return data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack lls=new LinkedListStack();
		lls.push(20);
		lls.push(50);
		lls.pop();
		lls.top();
	}

}
