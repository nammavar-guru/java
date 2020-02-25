package com.example.DataStructure.queue;

import java.util.ArrayList;
import java.util.List;

public class ArrayListQueue {
	
	List<Integer> list = new ArrayList<>();
	
	public void push(int data) {
		list.add(data);
		System.out.println("Push List"+list);
	}
	
	public int pop() {
		//int index = list.size()-1;
		int index=0;
		int deletedValue = list.get(index);
		list.remove(index);
		System.out.println("Pop List"+list);
		return deletedValue;
		
	}

	public static void main(String[] args) {
		ArrayListQueue als = new ArrayListQueue();
		als.push(1);
		als.push(2);
		als.push(3);
		als.push(4);
		als.pop();
		als.push(5);
		als.pop();
		als.pop();
		
	}

}
