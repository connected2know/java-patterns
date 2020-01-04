package main.java.decorator;

public class FootballMatchShow implements Show{
	
	private double cost;
	private String description;

	public FootballMatchShow(double cost, String description) {
		this.cost = cost;
		this.description = description;
	}
	
	@Override
	public double showCost() {
		return this.cost;
	}

	@Override
	public String showDescription() {
		return this.description;
	}

}
