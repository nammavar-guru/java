package com.example.pattern.creational.Singleton;

public class SingletonExampleCloneNotSupported implements Cloneable {
private SingletonExampleCloneNotSupported() {
	
}
public static SingletonExampleCloneNotSupported singletonInstance = new SingletonExampleCloneNotSupported();

public Object clone() throws CloneNotSupportedException{
	throw new CloneNotSupportedException();
}
	
public static void main(String args[]) throws CloneNotSupportedException {
	SingletonExampleCloneNotSupported instance1 = SingletonExampleCloneNotSupported.singletonInstance;
	System.out.println("HashCode of instance1 "+instance1.hashCode());
		SingletonExampleCloneNotSupported instance2 = (SingletonExampleCloneNotSupported)instance1.clone();
	System.out.println("HashCode of instance1 "+instance1.hashCode());
	System.out.println("HashCode of instance2 "+instance2.hashCode());
 }
}
