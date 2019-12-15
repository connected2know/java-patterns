package main.java.abstractfactory;

import java.util.List;

public interface AmericanTravelFactory {
	
	List<Beach> createBeachDestinations();
	
	List<Mountain> createMountaiDestinations();

}
