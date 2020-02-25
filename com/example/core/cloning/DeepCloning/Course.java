 package com.example.core.cloning.DeepCloning;

public class Course implements Cloneable{
	String subject;
	
	public Course(String subject) {
		this.subject = subject;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return (Course)super.clone();
	}
}
