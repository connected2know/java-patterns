package main.java.observer.custom;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Observable{
	
	private List<Observer> observers;
	private String newsCountry;
	private String newsText;
	
	public NewsAgency() {
		observers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(newsCountry, newsText);
		}
	}
	
	public void setNews(String newNewsCoutry, String newNewsText) {
		this.newsCountry = newNewsCoutry;
		this.newsText = newNewsText;
		notifyObservers();
	}

}
