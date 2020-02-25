package com.example.core.cloning.CloningNotSupported;

public class CloningNotSupported {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course science = new Course("Science");
		Student student1 = new Student(1,"Guru",science);
		Student student2 = null;
		try {
			student2 = (Student)student1.clone();
		}catch(CloneNotSupportedException e) {
			System.out.println("Clone Not suppoted by the student"+e);
		}
		
		
		
	}

}
