package main.java.abstractfactory;

import java.util.List;

public abstract class Travel {
	
	String packageName;
	
	List<Beach> beachPlaces;
	
	List<Mountain> mountainPlaces;
	
	abstract void createCountryPackage();
	
	
}
