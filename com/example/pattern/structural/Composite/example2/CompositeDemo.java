package com.example.pattern.structural.Composite.example2;

public class CompositeDemo {

	public static void main(String[] args) {
		Directory music = new Directory("Music");
		Directory pop = new Directory("Pop");
		Directory album = new Directory("Album");
		File f1 = new File("1.mp3");
		File f2 = new File("2.mp3");
		File f3 = new File("3.mp3");
		File f4 = new File("4.mp3");
		File f5 = new File("5.mp3");
		
		music.add(f1);
		pop.add(f2);
		pop.add(f3);
		pop.add(f4);
		album.add(f5);
		music.ls();
		pop.ls();
		album.ls();
	}
}
