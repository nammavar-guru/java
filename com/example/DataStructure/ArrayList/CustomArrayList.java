package com.example.DataStructure.ArrayList;

import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class CustomArrayList {
	
	private static int default_capacity=5;
	private int size;
	private transient Object[] element;
	
	public CustomArrayList() {
		element = new Object[default_capacity];
	}
	
	public boolean add(Object obj) {
		if(size==element.length) {
			increaseCapacity();
		}
		element[size++] = obj;
		return true;
	}
	
	public Object get(int index) {
		if(index>=size && index<0)
			throw new ArrayIndexOutOfBoundsException();
		return element[index];
	}
	
	public Object remove(int index) {
		if(index<size) {
			Object obj = element[index];
			element[index]=null;
			int temp = index;
			while(temp<size) {
				element[temp] = element[temp+1];
				element[temp+1]=null;
				temp++;
			}
			size--;
			return obj;
		}else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	
	public boolean contains(Object obj) {
		boolean flag = false;
		if(obj != null) {
			for(int i=0;i<size;i++) {
				if(obj.equals(element[i])) {
					flag=true;
				}
			}
		}
		return flag;
	}
	
	
	public void increaseCapacity() {
		int increasedSize = element.length*2;
		Arrays.copyOf(element, increasedSize);
	}
	
	public int size() {
		return size;
	}
	
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(element[i] +" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		CopyOnWriteArrayList c = new CopyOnWriteArrayList();
		
		// TODO Auto-generated method stub
		  CustomArrayList list = new CustomArrayList();
          list.add("AB");
          list.add("BC");
          System.out.println(list.size());
          System.out.println(list.contains("AB")); 
          list.add("CD");
          list.display();
          list.remove(1);
          list.display();
	}

}
