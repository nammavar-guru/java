package com.example.core.immutable;


public class ImmutableClass {

	public static void main(String[] args) {
		Student s = new Student("ABC", 101); 
        System.out.println(s.getName()); 
        System.out.println(s.getRegNo());
        //s.regNo = 10; //final field can not be assigned
        s= new Student("guru",121);
        System.out.println(s.getName()); 
        System.out.println(s.getRegNo());
        
	}

}
