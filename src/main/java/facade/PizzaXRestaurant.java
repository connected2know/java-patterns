package main.java.facade;

import java.util.Random;

public class PizzaXRestaurant implements Restaurant{

	@Override
	public int createOrder() {
		Random rand = new Random();
		int randomGenerated = rand.nextInt( Integer.MAX_VALUE ) + 1; // to generate only positive random numbers
		return randomGenerated;
	}

	@Override
	public boolean isBakingDone() {
		return true;
	}

}
