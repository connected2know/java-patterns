package main.java.decorator;

public class DecoraterMain {

	public static void main(String[] args) {
		
		Show match = new FootballMatchShow(80, "Manchester United vs PSG");
		match = new ShowBeverages(match);
		match = new VIPPlace(match);
		
		System.out.println(match.showDescription() + ". $" + match.showCost() );

	}

}
