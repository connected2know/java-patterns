package main.java.decorator;

public class ShowBeverages extends ShowDecorator{
	
	Show show;
	
	public ShowBeverages(Show show) {
		this.show = show;
	}

	@Override
	public double showCost() {
		return show.showCost() + 5;
	}

	@Override
	public String showDescription() {
		return show.showDescription() + " + Beverages included ";
	}

}
