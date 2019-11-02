package main.java.singleton;

public class SingletonSyncBlock {

	private static SingletonSyncBlock SINGLETON_INSTANCE; // creation of constant object of type Singleton  

	private SingletonSyncBlock() {} // making the constructor private to avoid that more instances of this object are created

	public SingletonSyncBlock getInstance() { // when getting a new instance, getInstance as synchronized method is
												// called

		if (SINGLETON_INSTANCE == null) { // if no Singleton was yet initialized, one instance will be created else,
											// it's returned the one already created.

			synchronized (SingletonSyncBlock.class) { // synchronized block

				if (SINGLETON_INSTANCE == null) {

					SINGLETON_INSTANCE = new SingletonSyncBlock();

				}

			}

		}

		return SINGLETON_INSTANCE;

	}

}
