package main.java;

public class SingletonEagerStaticBlock {

	private static SingletonEagerStaticBlock SINGLETON_INSTANCE; // creation of constant object of type Singleton.
																	// Because we are using static, we will have only
																	// one instance per Singleton in memory and because
																	// we are using final, the value of
																	// SINGLETON_INSTANCE cannot change

	static {

		SINGLETON_INSTANCE = new SingletonEagerStaticBlock(); // creation of constant object of type Singleton. This
																// creation is being done inside a static block (static
																// blocks can be used to start static variables) 
	}

	private SingletonEagerStaticBlock() {} // making the constructor private to avoid that more instances of this object are created

	public SingletonEagerStaticBlock getInstance() { // creating a simple method to return the unique SINGLETON_INSTANCE
														// object every time is requested

		return SINGLETON_INSTANCE;

	}

}
