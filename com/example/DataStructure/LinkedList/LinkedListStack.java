package com.example.DataStructure.LinkedList;

import com.example.DataStructure.LinkedList.LinkedListQueue.Node;

public class LinkedListStack {
	private Node head;
	
	class Node{
		int data;
		Node next;
		
		
		public void displayNode() {
			System.out.print( data + " ");
		}
		
		}
	
	public LinkedListStack() {
		head = null;
	}
	
	//insert at top
	public void push(int data) {
		Node temp= head;
		head = new Node();
		head.data = data;
		head.next = temp;
		System.out.println("push element in the top:"+head.data);
	}
	
	//delete at top
	public void pop() {
		if(head==null) {
			System.out.println("Linked List stack is empty");
		}
		
		Node temp = head;
		head = head.next;
		System.out.println("Popped element in the top:"+temp.data);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack stackLinkedList = new LinkedListStack();
		stackLinkedList.push(11); //push node.
        stackLinkedList.push(71); //push node.
        stackLinkedList.push(39); //push node.
        stackLinkedList.push(31); //push node.

        stackLinkedList.pop();  //pop Node
        stackLinkedList.pop();  //pop Node
        stackLinkedList.pop();  //pop Node
        stackLinkedList.pop();  //pop Node

	}

}
