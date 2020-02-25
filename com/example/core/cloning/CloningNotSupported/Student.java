package com.example.core.cloning.CloningNotSupported;

public class Student implements Cloneable {
	int id;
	String name;
	Course course;
	
	public Student(int id, String name, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	public Object clone() throws CloneNotSupportedException{
		 throw new CloneNotSupportedException();
	}
	
}
