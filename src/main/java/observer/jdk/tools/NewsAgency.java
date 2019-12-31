package main.java.observer.jdk.tools;

import java.util.Observable;

public class NewsAgency extends Observable{
	
	private String newsCountry;
	private String newsText;
	
	public NewsAgency() {
	}
	
	public void setNews(String newNewsCoutry, String newNewsText) {
		setChanged();
		notifyObservers();
	}

	public String getNewsCountry() {
		return this.newsCountry;
	}

	public String getNewsText() {
		return this.newsText;
	}
	
}
