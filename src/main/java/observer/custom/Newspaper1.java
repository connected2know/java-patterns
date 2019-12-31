package main.java.observer.custom;

public class Newspaper1 implements Observer,Printer{
	
	private String newsCountry;
	private String newsText;
	private Observable newsAgency;
	
	public Newspaper1(Observable newsAgency) {
		this.newsAgency = newsAgency;
		this.newsAgency.addObserver(this);
	}

	@Override
	public void update(String newsCountry, String newsText) {
		this.newsCountry = newsCountry;
		this.newsText = newsText;
		printNews();
	}
	
	@Override
	public void printNews() {
		System.out.println("News received just now from country: " + this.newsCountry 
				+ "with text: " + this.newsText);
	}

}
