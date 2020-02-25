package com.example.core.externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Person implements Externalizable{
	int id;
	String name;
	String deptId;
	String address;
	public Person() {
	}
	
	public Person(int id, String name, String deptId, String address) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.address = address;
	}
	
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name);
	}
	
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		int tempId = in.readInt();
		String tempName = (String)in.readObject();
		id = tempId;
		name = tempName;
	}
}
