package com.example.core.collection.List.LinkedList;

class Node {
	int data;
	Node nextNode;
}

class LinkedList{
	private Node head;
	
	public void insert(int data) {
		 //create a new Node and store a data.
		Node newNode = new Node();
		newNode.data = data;
		newNode.nextNode = null;
		
		//check the head is null or not.
        //if head is null, assign the Node and exit.
		if(this.head == null) {
			head = newNode;
			return;
		}	
		
		//assign a head into the temp Node and loop it until find the null reference.
		Node tempNode = this.head;
		while(tempNode.nextNode != null) {
			tempNode = tempNode.nextNode;
		}
		

        //assign new node.
        tempNode.nextNode = newNode;
    }
	
	public void print() {
		if(this.head == null) {
			return;
		}
		
		//Print all nodes
		Node tempNode = this.head;
		while(tempNode != null) {
			System.out.println(tempNode.data +"->");
			tempNode = tempNode.nextNode;
		}
		//System.out.println("NULL");
	}
}
public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls = new LinkedList();
	      //ls.insert(10);
	      //ls.insert(20);
	      //ls.insert(30);
	      ls.print();
	}

}
