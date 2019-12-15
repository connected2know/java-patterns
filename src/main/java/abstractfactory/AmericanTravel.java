package main.java.abstractfactory;

public class AmericanTravel extends Travel{
	
	AmericanTravelFactory travelFactory;
	
	public AmericanTravel(AmericanTravelFactory travelFactory) {
		this.travelFactory = travelFactory;
	}

	@Override
	void createCountryPackage() {
		beachPlaces = travelFactory.createBeachDestinations();
		mountainPlaces = travelFactory.createMountaiDestinations();
	}

}
