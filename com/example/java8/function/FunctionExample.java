package com.example.java8.function;

import java.util.function.Function;

class Student {
	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

}

public class FunctionExample {
	public static void main(String args[]) {

		Function<Student, String> f = s -> {
			int marks = s.marks;
			String grade = "";
			if (marks >= 80)
				grade = "Distinction";
			else if (marks >= 60)
				grade = "First class";
			else
				grade = "Fail";
			return grade;
		};

		Student st[] = { new Student("Kumaresh", 90), new Student("guru", 70) };
		for (Student s2 : st) {
			System.out.println("Name:" + s2.name);
			System.out.println("Marks:" + s2.marks);
			System.out.println("Grade:" + f.apply(s2));
			System.out.println("");
		}
	}
}
