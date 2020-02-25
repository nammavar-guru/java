package com.example.pattern.behavioral.observable;

import java.util.ArrayList;
import java.util.List;

public class Subject {
private String news;
private List<Observer> channels = new ArrayList<>();

public void addObserver(Observer channel) {
	channels.add(channel);
}

public void removeObserver(Observer channel) {
	channels.remove(channel);
}

public void setNews(String news) {
	this.news = news;
	for(Observer channel:this.channels) {
		channel.update(news);
	}
}


}
