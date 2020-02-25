package com.example.core.innerclass.anonymous;

class Person{
	public void eat() {
		System.out.println("Person - Eat");
	}
}

abstract class Employee{
	abstract void methodA();
}
public class anonymousClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Person() {
			public void eat() {
				System.out.println("Anonymous class Person - Eat");
			}
			
			public void wash() {
				System.out.println("Anonymous class Person - wash");	
			}
		};
		
		Person p1 = new Person();
		p.eat();
//		p.wash(); // compile time error
		p1.eat();
		
		Employee e = new Employee() {
			 void methodA() {
				 System.out.println("Anonoymous abstract class Employee - methodA");
			}
		};
		
		e.methodA();
	}

}
