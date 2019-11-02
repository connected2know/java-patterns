package main.java.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerializationSolution implements Serializable {

	private static final long serialVersionUID = 1L;

	public static SingletonSerializationSolution SINGLETON = new SingletonSerializationSolution();

	private SingletonSerializationSolution() {
	}

	public static SingletonSerializationSolution getInstance() {

		return SINGLETON;

	}

	protected Object readResolve() { // we implement readResolve returning the Object SINGLETON

		return SINGLETON;

	}

	public static void main(String[] args) {

		try {

			SingletonSerializationSolution singletonToWrite = SingletonSerializationSolution.getInstance();

			FileOutputStream fout = new FileOutputStream("singleton.txt");

			ObjectOutputStream out = new ObjectOutputStream(fout);

			out.writeObject(singletonToWrite);

			out.flush();

			out.close();

			System.out.println("singletonToWrite hashCode: " +

					singletonToWrite.hashCode());

			ObjectInputStream in =

					new ObjectInputStream(new FileInputStream("SingletonSerializationSolution.txt"));

			SingletonSerializationSolution singletonToRead = (SingletonSerializationSolution) in.readObject();

			in.close();

			System.out.println("singletonToRead hashCode: " +

					singletonToRead.hashCode());

		} catch (Exception ex) {

			System.out.println(ex);

		}

	}

}
