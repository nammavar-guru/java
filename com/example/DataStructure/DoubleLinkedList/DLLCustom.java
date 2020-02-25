package com.example.DataStructure.DoubleLinkedList;

public class DLLCustom {
	Node head;
	Node tail;
	
	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(head);
		if(head!=null) {
			head.setPrev(newNode);
		}
		if(head==null) {
			tail= newNode;
		}
		head=newNode;
		System.out.println("adding at front: "+head.data);
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setPrev(tail);
		if(tail != null) {
			tail.setNext(newNode);
		}
		if(tail==null) {
			head=newNode;
		}
		tail = newNode;
		System.out.println("adding at last: "+tail.data);
	}
	
	
	public void deleteFirst() {
		if(head==null) {
			return;
		}
		Node temp = head.getNext();
		if(temp!= null)
			temp.setPrev(null);
		if(temp==null)
			tail=null;
		 System.out.println("removed from front: "+head.getData());
		head = temp;
	}
	
	public void deleteLast() {
	if(tail==null) {
		return;
	}
	Node temp = tail.getPrev();
	if(temp!=null)
		temp.setNext(null);
	if(temp==null)
		head = null;
	System.out.println("removed from rear: "+tail.getData());
	tail = temp;
	}
	
	
	class Node{
		int data;
		Node prev;
		Node next;
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
		public Node getPrev() {
			return prev;
		}
		public void setPrev(Node prev) {
			this.prev = prev;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLLCustom linkedList = new DLLCustom();
		linkedList.insertFirst(11);
        linkedList.insertFirst(21);
        linkedList.insertFirst(59);
        linkedList.insertFirst(14);
        linkedList.insertFirst(39);

        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.deleteFirst();
        linkedList.deleteFirst();

    	DLLCustom linkedListL = new DLLCustom();
    	
        linkedListL.insertLast(11);
        linkedListL.insertLast(21);
        linkedListL.insertLast(59);
        linkedListL.insertLast(14);
        linkedListL.insertLast(39);

        linkedListL.deleteLast();
        linkedListL.deleteLast();
        linkedListL.deleteLast();
        linkedListL.deleteLast();
        linkedListL.deleteLast();
	}

}
