package com.example.java8.Lambda;

@FunctionalInterface
interface interf {
	public void m1();
}

interface intera {
	public void abc(int a, int b);

}

interface interb {
	public int abc(int a, int b);

}


interface interc {
	public int abc(int a);

}
public class lambdaExpExample1 {

	public static void main(String[] args) {
		interf inter = () -> System.out.println("Testing lambada expression");
		interf intera = () -> System.out.println("Testing lambada expression new");
		inter.m1();
		intera.m1();
		
		intera inte = (a, b) -> System.out.println(" " + a + " * " + b + "=" + a * b);
		interb intb = (a, b) -> a * b;
		System.out.println("Return int value 1 " + intb.abc(5, 10));
		interc intc = a -> a * a;
		System.out.println("Return int value 1 " + intc.abc(5));
		
		
		interb intd =(a,b)->{return a*b;};
		
		
		inte.abc(5, 10);
		inte.abc(10, 10);
		System.out.println("Return int value 1 " + intb.abc(5, 10));
		System.out.println("Return int value 2 " + intd.abc(10, 10));
		
	}

}
