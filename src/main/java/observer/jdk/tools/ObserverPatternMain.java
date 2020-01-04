package main.java.observer.jdk.tools;

public class ObserverPatternMain {

	public static void main(String[] args) {
		NewsAgency newsAgency = new NewsAgency();
		new Newspaper1(newsAgency);
		new Newspaper2(newsAgency);
		
		newsAgency.setNews("Portugal", "Good weather for weekend!");
	}

}
