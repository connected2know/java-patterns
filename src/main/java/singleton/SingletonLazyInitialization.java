package main.java.singleton;

public class SingletonLazyInitialization {

	private static SingletonLazyInitialization SINGLETON_INSTANCE; // creation of constant object of type Singleton

	private SingletonLazyInitialization() {} // making the constructor private to avoid that more instances of this object are created

	public SingletonLazyInitialization getInstance() { // every time it's necessary an instance of Singleton this method
														// can be called

		if (SINGLETON_INSTANCE == null) { // if no Singleton was yet initialized, one instance will be created else,  it's returned the one already created.

			SINGLETON_INSTANCE = new SingletonLazyInitialization();

		}

		return SINGLETON_INSTANCE;

	}

}
