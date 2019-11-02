package main.java;

public class SingletonNestedClass {

	private SingletonNestedClass() {} // making the constructor private to avoid that more instances of this object are created

	private static class SingletonClassHelper { // static nested class that will be used to create the Singleton
												// instance

		private static final SingletonNestedClass SINGLETON_INSTANCE = new SingletonNestedClass(); // static and final
																									// are being used to
																									// create the
																									// instance, meaning
																									// that only one
																									// instance will be
																									// available

	}

	public static SingletonNestedClass getInstance() {

		return SingletonClassHelper.SINGLETON_INSTANCE; // getting the Singleton instance

	}

}
