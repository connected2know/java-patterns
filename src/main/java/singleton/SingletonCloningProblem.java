package main.java.singleton;

public class SingletonCloningProblem implements Cloneable {

	public static SingletonCloningProblem SINGLETON = new SingletonCloningProblem(); // we simply create a unique new
																						// instance of Singleton.

	private SingletonCloningProblem() {
	} // making the constructor private to avoid more than one instantiation

	public static SingletonCloningProblem getInstance() { // method that will return the unique instantiation of the
															// class Singleton

		return SINGLETON;

	}

	public static void main(String[] args) {

		try {

			SingletonCloningProblem singleton1 = SingletonCloningProblem.getInstance(); // we get an instance of
																						// Singleton

			System.out.println("singleton1 hashCode: "

					+ singleton1.hashCode()); // we print the hash code of the original instance with value: 366712642

			SingletonCloningProblem singleton2 = (SingletonCloningProblem) singleton1.clone(); // we call the clone
																								// method. This will
																								// return a new instance
																								// of the Singleton

			System.out.println("singleton2 hashCode: "

					+ singleton2.hashCode()); // we call the hash code of the cloned instance with value: 1829164700

		} catch (Exception ex) {

			System.out.println(ex);

		}

	}

}
