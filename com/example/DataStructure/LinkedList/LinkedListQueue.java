package com.example.DataStructure.LinkedList;

public class LinkedListQueue {
	private Node head;
	
	class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
		
		public void displayNode() {
			System.out.print( data + " ");
		}
	}
	
	public LinkedListQueue() {
		head = null;
	}
	
	//enqueue Last
	public void enqueue(int data) {
		
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode; 
			return;
		}
		
		Node temp = head;
		while(temp.next!=null) {
			temp =temp.next;
		}
		temp.next= newNode;
		
	}
	
	//delete First
	public void dequeue() {
		if(head == null)
			System.out.println("Queue is empty");
		Node temp = head;
		head= head.next;
	}
	
	public void displayLinkedList() {
		Node temp = head;
		while(temp!=null) {
			temp.displayNode();
			temp = temp.next;
		}
		 System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListQueue queueLinkedList = new LinkedListQueue();
		queueLinkedList.enqueue(11); //enqueue node.
        queueLinkedList.displayLinkedList(); // display QUEUE IMPLEMENTED USING LINKED LIST
        queueLinkedList.enqueue(71); //enqueue node.
        queueLinkedList.displayLinkedList(); // display QUEUE IMPLEMENTED USING LINKED LIST
        queueLinkedList.enqueue(39); //enqueue node.
        queueLinkedList.displayLinkedList(); // display QUEUE IMPLEMENTED USING LINKED LIST
        queueLinkedList.enqueue(31); //enqueue node.
        queueLinkedList.displayLinkedList(); // display QUEUE IMPLEMENTED USING LINKED LIST

        System.out.println("\nDELETING FROM FIRST (FRONT) OF QUEUE IMPLEMENTED USING LINKED LIST ");

        queueLinkedList.dequeue();  //dequeue Node
        queueLinkedList.displayLinkedList(); // display QUEUE IMPLEMENTED USING LINKED LIST
        queueLinkedList.dequeue();  //dequeue Node
        queueLinkedList.displayLinkedList(); // display QUEUE IMPLEMENTED USING LINKED LIST
        queueLinkedList.dequeue();  //dequeue Node
        queueLinkedList.displayLinkedList(); // display QUEUE IMPLEMENTED USING LINKED LIST
        queueLinkedList.dequeue();  //dequeue Node
        queueLinkedList.displayLinkedList();
	}

}
