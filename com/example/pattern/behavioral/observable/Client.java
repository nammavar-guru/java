package com.example.pattern.behavioral.observable;

public class Client implements Observer{
	String news;

	public void setNews(String news) {
		this.news = news;
	}
	
	public void update(String news) {
		this.setNews(news);
		System.out.println("updated to NewsChannel -"+news);
	}
	
	
}
