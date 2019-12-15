package main.java.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class  BrazilTravelFactory implements AmericanTravelFactory{

	@Override
	public List<Beach> createBeachDestinations() {
		List<Beach> destinations = new ArrayList<>();
		destinations.add(new RioDeJaneiroBeach());
		return destinations;
	}

	@Override
	public List<Mountain> createMountaiDestinations() {
		List<Mountain> destinations = new ArrayList<>();
		destinations.add(new PicoParanaMountain());
		return destinations;
	}

}
