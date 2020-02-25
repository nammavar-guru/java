package com.example.core.serialization;

import java.io.Serializable;

public class Person implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6249250551300108951L;
	int id;
	static String name;
	transient String deptId;
	final String address;
	
//	ID1
//	Namenull
//	Deptnull
//	AddressTKM

	
	public Person(int id, String name, String deptId, String address) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.address = address;
	}
	
}
