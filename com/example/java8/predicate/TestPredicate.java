package com.example.java8.predicate;

import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class TestPredicate {

	public static void main(String args[]) {
	
		String s = "kumar";
		Predicate<String> p = i->s.length()>5;
		System.out.println("Result-->"+p.test(s));
		
		BiPredicate<Integer,Integer> bi = (a,b)->a*b>5;
		System.out.println("BiPredicate Result-->"+bi.test(2,3));
		System.out.println("BiPredicate Result-->"+bi.test(2,2));
		
		int in[] = {0,5,10,25,8,7};
		Predicate<Integer> p1 = q->q%2==0;
		Predicate<Integer> p2 = q->q>10;
		
		System.out.println("Predicate verification");
		
		for(int i=0;i<in.length;i++) {
			System.out.println("P1-->"+i+"-->"+p1.test(in[i]));
			System.out.println("P2-->"+i+"-->"+p2.test(in[i]));
			
		}	
		
		
	}
}
