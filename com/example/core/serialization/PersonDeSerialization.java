package com.example.core.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PersonDeSerialization {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("serial.text");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Person p = (Person) ois.readObject();
		System.out.println("ID"+p.id);
		System.out.println("Name"+p.name);
		System.out.println("Dept"+p.deptId);
		System.out.println("Address"+p.address);
		
		
	}

}
