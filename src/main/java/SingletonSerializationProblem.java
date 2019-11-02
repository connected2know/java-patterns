package main.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerializationProblem implements Serializable { // for us to be able to serialize an object, we
																		// need to implement Serializable interface

	private static final long serialVersionUID = 1L;

	public static SingletonSerializationProblem SINGLETON = new SingletonSerializationProblem(); // creating an unique
																									// instance of
																									// Singleton

	private SingletonSerializationProblem() {
	} // making the constructor private to avoid more than one instantiation

	public static SingletonSerializationProblem getInstance() { // method that will return the unique instantiation of
																// the class Singleton

		return SINGLETON;

	}

	public static void main(String[] args) { // main to test serialize and deserialize Singleton

		try {

			SingletonSerializationProblem singletonToWrite = SingletonSerializationProblem.getInstance(); // we get the
																											// unique
																											// Singleton
																											// instance

			FileOutputStream fout = new FileOutputStream("singleton.txt"); // we prepare the serialization of the
																			// instance into a file

			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(singletonToWrite); // we write the bytes of Singleton object into the file

			out.flush();

			out.close();

			System.out.println("singletonToWrite hashCode: " +

					singletonToWrite.hashCode()); // 1 - printing the hash code of the serialized object we get:
													// 1550089733

			ObjectInputStream in =

					new ObjectInputStream(new FileInputStream("SingletonSerializationProblem.txt")); // we prepare to
																										// read the
																										// contents of
																										// the file that
																										// contains the
																										// java
																										// serielized
																										// object

			SingletonSerializationProblem singletonToRead = (SingletonSerializationProblem) in.readObject(); // we
																												// deserialize
																												// the
																												// into
																												// an
																												// object
																												// of
																												// type
																												// Singleton

			in.close();

			System.out.println("singletonToRead hashCode: " +

					singletonToRead.hashCode()); // we print the hash code of the deserielized object with value:
													// 1406718218

		} catch (Exception ex) {

			System.out.println(ex);

		}

	}

}
