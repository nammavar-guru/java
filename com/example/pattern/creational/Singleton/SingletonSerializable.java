package com.example.pattern.creational.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerializable implements Serializable {
	
	private static SingletonSerializable instance = new SingletonSerializable();
	
	private SingletonSerializable() {}
	
	public static SingletonSerializable getInstance() {
		return instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		SingletonSerializable instance1 = SingletonSerializable.getInstance();
		
		ObjectOutput out = null;
		out = new ObjectOutputStream(new FileOutputStream("Singleton.temp"));
		
		out.writeObject(instance1);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("Singleton.temp"));
		SingletonSerializable instance2 = (SingletonSerializable)in.readObject();
		
		System.out.println("HashCode of instance1 "+instance1.hashCode());
		System.out.println("HashCode of instance2 "+instance2.hashCode());
		
		
	}

}
