package main.java.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class USATravelFactory  implements AmericanTravelFactory{

	@Override
	public List<Beach> createBeachDestinations() {
		List<Beach> destinations = new ArrayList<>();
		destinations.add(new MiamiBeach());
		return destinations;
	}

	@Override
	public List<Mountain> createMountaiDestinations() {
		List<Mountain> destinations = new ArrayList<>();
		destinations.add(new AshevilleMountain());
		return destinations;
	}

}
