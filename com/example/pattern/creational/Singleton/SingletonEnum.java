package com.example.pattern.creational.Singleton;
//It supports only early loading or Eager initialization
public enum SingletonEnum {
	INSTANCE;
	
	public void doProcess() {
		System.out.println("doProcess");
	}
	
	public static void main(String args[]) throws CloneNotSupportedException {
		SingletonEnum instance1 = SingletonEnum.INSTANCE;
		System.out.println("HashCode of instance1 "+instance1.hashCode());
		SingletonEnum instance2 = SingletonEnum.INSTANCE;
		System.out.println("HashCode of instance2 "+instance2.hashCode());
	 }
}
