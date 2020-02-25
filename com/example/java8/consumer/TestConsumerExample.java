package com.example.java8.consumer;
import java.util.function.Consumer;

class Movie {
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
	
}
public class TestConsumerExample {

	public static void main(String[] args) {
	 Consumer<Movie> c1 = m->System.out.println(m.name+" Ready to Release");
	 Consumer<Movie> c2 = m->System.out.println(m.name+" Released");
	 Consumer<Movie> c3 = m->System.out.println(m.name+" Reviewed");
	 Consumer<Movie> cc= c1.andThen(c2).andThen(c3);
 	 
	 Movie t = new Movie("Guru");
	 
	 cc.accept(t);
	 
	 
	}

}
