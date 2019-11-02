package main.java;

import java.lang.reflect.Constructor;

public class SingletonReflectionProblem {

	public SingletonReflectionProblem makeAnotherSingletonWithReflectionAPI() { // method that will create a second
																				// instance of Singleton class.

		SingletonReflectionProblem result = null;

		try {

			Constructor[] constructors = SingletonReflectionProblem.class.getDeclaredConstructors(); // using reflection
																										// API we get
																										// all Singleton
																										// constructors

			for (Constructor constructor : constructors) {

				constructor.setAccessible(true); // making the constructor accessible to use for a new object creation

				result = (SingletonReflectionProblem) constructor.newInstance(); // creating a second instance

				break; // exiting the for cycle because we only need one instance more to break the
						// Singleton pattern

			}

		} catch (Exception ex) {

			System.out.println(ex);

		}

		return result;

	}

}
