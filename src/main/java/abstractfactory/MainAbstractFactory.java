package main.java.abstractfactory;

import java.util.List;

public class MainAbstractFactory {

	public static void main(String[] args) {


		AmericanTravelFactory travelUSAFactory = new USATravelFactory();
		
		Travel travel = new AmericanTravel(travelUSAFactory);
		
		travel.createCountryPackage();
		
		List<Beach>  beachesUSA = travel.beachPlaces;
		
		System.out.println(beachesUSA.get(0).getClass()); //class main.java.abstractfactory.MiamiBeach
	}

}
