package com.example.core.collection.Recursion;

public class RecursionExample {

	public int print(int num) {
		if(num==0)
			return 0;
		else {
			System.out.print(" "+num);
			return print(num-1);
		}
	}
	
	public int factorial(int n) {
		if(n!=0) {
			int r = n*factorial(n-1);
			System.out.print(" "+r);
			return r;
		}
			
		else 
			return 1;
	}
	
	int n1=0;
	int n2=1;
	int n3=0;
	
	public void fibnaci(int n) {
		if(n>0) {
			n3 = n1 +n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibnaci(n-1);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionExample re = new RecursionExample();
		re.print(5);
		//System.out.println("final Print "+re.print(5));
		System.out.println("\nFibonaci Series");
		re.fibnaci(10);
		System.out.println("\nFactorail Series");
		re.factorial(5);
		//System.out.println("fibonacci Series "+re.fibnaci(10));
	}

}
