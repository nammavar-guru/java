package com.example.core.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PersonSerialization {
	public static void main(String args[]) throws Exception {
		Person p = new Person(1,"guru","IT","TKM");
		FileOutputStream fos = new FileOutputStream("serial.text");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.flush();
		oos.close();
		System.out.println("Person Object is save to serial.text");
	}
}
