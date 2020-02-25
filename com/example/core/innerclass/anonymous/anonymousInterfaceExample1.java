package com.example.core.innerclass.anonymous;

interface interfaceA{
	public void methodA();
}
public class anonymousInterfaceExample1 {

	public static void main(String[] args) {
		interfaceA ia = new interfaceA() {
			public void methodA() {
				System.out.println("interface ia");
			}
		};
		
		
		interfaceA ia1 =()->{System.out.println("interface a1 from lambda expression");};
		
		ia.methodA();
		ia1.methodA();
	}

}
