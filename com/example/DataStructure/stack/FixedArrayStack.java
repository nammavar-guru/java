package com.example.DataStructure.stack;

public class FixedArrayStack {

	public static final int CAPACITY =10;
	
	int stackArray[];
	int top = -1;
	
	public FixedArrayStack() {
		this(CAPACITY);
	}
	
	public FixedArrayStack(int capacity) {
		stackArray = new int[capacity];
	}
	
	public int size() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return (top < 0);
	}
	
	public void push(int data) throws Exception {
		if(size()==CAPACITY)
			throw new Exception("Stack is full");
		else
		{
			stackArray[++top] = data;
		}
		for(int e:stackArray) {
			System.out.println("Pushed element :"+e);
		}
	}
	
	
	public int pop() throws Exception {
		int data;
		if(isEmpty())
			throw new Exception("Stack is Empty");
		
		int deleteValue = data = stackArray[top--];
		System.out.println("Popped element :"+data);
		System.out.println("Deleted Value :"+deleteValue);
		return data;
	}

	public int top() throws Exception {
		int data;
		if(isEmpty())
			throw new Exception("Stack is Empty");
		data = stackArray[top];
		System.out.println("top element :"+data);
		return data;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FixedArrayStack fas = new FixedArrayStack();
		fas.push(20);
		fas.push(40);
		fas.pop();
		fas.top();
		
	}

}
