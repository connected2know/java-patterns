package main.java;

public class SingletonEagerInitialization {

	private static final SingletonEagerInitialization SINGLETON_INSTANCE = new SingletonEagerInitialization(); // creation of constant object of type Singleton. Because we are using static we will have only one instance per Singleton in memory and because we are using final, the value of SINGLETON_INSTANCE cannot change 


	 


	private SingletonEagerInitialization() {}; // making the constructor private to avoid that more instances of this object
											// are created by other classes

	public SingletonEagerInitialization getInstance() { // creating a simple method to return the unique SINGLETON_INSTANCE object every
										// time it's requested

		return SINGLETON_INSTANCE;

	}

}
