package com.example.DataStructure.DoubleLinkedList;



public class DoubleLinkedListCustom {
	private Node head;
	private Node tail;
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data= data;
		}
		
		public void displayNode() {
			System.out.print(data+ "  ");
		}
	}
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
		} else {
			head.prev = newNode;
			newNode.next = head;
			head= newNode;
		}
	}
	
	public void deleteFirst() {
		if(head==null) {
			System.out.println("Linked List is empty");
		} else {
			Node temp = head;
			head = head.next;
			System.out.println("Deleted element in the head:"+temp.data);
		}
	}
	
	public void insertLast(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
		} else {
			Node temp = head;
			while(temp.next!=null) {
				temp =temp.next;
			}
			temp.next= newNode;
			newNode.prev = temp;
		}
	}
	
	public void deleteLast() {
		if(head==null) {
			System.out.println("Linked List is empty");
		} else {
			Node temp = head;
			while(temp.next!=null) {
				temp =temp.next;
			}
			System.out.println("temp"+temp.data);
			
			//temp.prev= null;
			if((temp.prev.next != null)) {
				if(temp.prev!=null)
				  temp.prev.next=null;
				else
				{
					//temp.next = null;
					temp=null;
				}	
			}
			
			//temp.prev=null;
			
			System.out.println("Deleted element in the head:"+temp.data);
		}
	}
	
	public void displayFrwd() {
        System.out.print("Displaying in forward direction [first--->last] : ");
        Node tempDisplay = head; // start at the beginning of linkedList
        while (tempDisplay != null){ // Executes until we don't find end of list.
               tempDisplay.displayNode();
               tempDisplay = tempDisplay.next; // move to next Node
        }
        System.out.println("");
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleLinkedListCustom linkedList = new DoubleLinkedListCustom();
		linkedList.insertFirst(11);
        linkedList.insertFirst(21);
        linkedList.insertFirst(59);
        linkedList.insertFirst(14);
        linkedList.insertFirst(39);

        linkedList.displayFrwd();

    	DoubleLinkedListCustom linkedListL = new DoubleLinkedListCustom();
    	
        linkedListL.insertLast(11);
        linkedListL.insertLast(21);
        linkedListL.insertLast(59);
        linkedListL.insertLast(14);
        linkedListL.insertLast(39);

        linkedListL.displayFrwd();
        
        linkedList.deleteFirst();
        linkedList.displayFrwd();
        linkedList.deleteFirst();
        linkedList.displayFrwd();
        linkedList.deleteFirst();
        linkedList.displayFrwd();
        linkedList.deleteFirst();
        linkedList.displayFrwd();
        linkedList.deleteFirst();
        linkedList.displayFrwd();

        linkedListL.deleteLast();
        linkedListL.displayFrwd();
        linkedListL.deleteLast();
        linkedListL.displayFrwd();
        linkedListL.deleteLast();
        linkedListL.displayFrwd();
        linkedListL.deleteLast();
        linkedListL.displayFrwd();
        linkedListL.deleteLast();
        linkedListL.displayFrwd();
	}

}
