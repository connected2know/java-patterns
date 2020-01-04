package main.java.decorator;

public class VIPPlace extends ShowDecorator{
	
	Show show;
	
	public VIPPlace(Show show) {
		this.show = show;
	}

	@Override
	public double showCost() {
		return show.showCost() + 20;
	}

	@Override
	public String showDescription() {
		return show.showDescription() + " + VIP place included ";
	}

}
