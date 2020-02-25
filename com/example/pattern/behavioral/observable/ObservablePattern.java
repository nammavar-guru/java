package com.example.pattern.behavioral.observable;

public class ObservablePattern {

	public static void main(String[] args) {
		Subject observable = new Subject();
		Client observer = new Client();
		observable.addObserver(observer);
		
		observable.setNews("News");

	}

}
