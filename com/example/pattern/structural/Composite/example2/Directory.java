package com.example.pattern.structural.Composite.example2;

import java.util.ArrayList;

public class Directory implements AbstractFile {
	private String name;
	private ArrayList includeFiles = new ArrayList();
	
	public Directory(String name) {
		this.name=name;
	}
	
	public void add(Object obj) {
		includeFiles.add(obj);
	}
	public void ls() {
		System.out.println(name);
		for(Object include:includeFiles) {
			AbstractFile af = (AbstractFile)include;
			af.ls();
		}
	}
}
