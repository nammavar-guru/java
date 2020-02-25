package com.example.core.cloning.ShallowCloning;

public class ShallowCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course science = new Course("Science");
		Student student1 = new Student(1,"Guru",science);
		Student student2 = null;
		try {
			student2 = (Student)student1.clone();
		}catch(CloneNotSupportedException e) {
			
		}
		student2.name ="Gurunathan";
		System.out.println(student1.name);
		System.out.println(student2.name);
		
		System.out.println(student1.course.subject);//Science
		student2.course.subject = "MATHS";
		System.out.println(student1.course.subject);//MATHS
		System.out.println(student2.course.subject);//MATHS
		
		
	}

}
