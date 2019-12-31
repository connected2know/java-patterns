package main.java.observer.jdk.tools;

import java.util.Observable;
import java.util.Observer;

public class Newspaper1 implements Observer,Printer{
	
	private Observable newsAgency;
	private String newsCountry;
	private String newsText;
	
	public Newspaper1(Observable newsAgency) {
		this.newsAgency = newsAgency;
		this.newsAgency.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof NewsAgency) {
			NewsAgency newsAgency = (NewsAgency) o;
			this.newsCountry = newsAgency.getNewsCountry();
			this.newsText = newsAgency.getNewsText();
			printNews();
			
		}
	}
	
	@Override
	public void printNews() {
		System.out.println("News received just now from country: " + this.newsCountry 
				+ "with text: " + this.newsText);
	}


}
