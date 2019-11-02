package main.java.singleton;

public class SingletonSyncMethod {

	private static SingletonSyncMethod SINGLETON_INSTANCE; // creation of constant object of type Singleton.  

	private SingletonSyncMethod() {} // making the constructor private to avoid that more instances of this object are created

	public static synchronized SingletonSyncMethod getInstance() { // when getting a new instance getInstance as
																	// synchronized method is called

		if (SINGLETON_INSTANCE == null) { // if no Singleton was yet initialized, one instance will be created else,
											// it's returned the one already created

			SINGLETON_INSTANCE = new SingletonSyncMethod();

		}

		return SINGLETON_INSTANCE;

	}

}
