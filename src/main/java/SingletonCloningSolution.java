package main.java;

public class SingletonCloningSolution implements Cloneable {

	public static SingletonCloningSolution SINGLETON = new SingletonCloningSolution();

	private SingletonCloningSolution() {
	}

	public static SingletonCloningSolution getInstance() {

		return SINGLETON;

	}

	@Override

	protected Object clone() throws CloneNotSupportedException { // we override the clone() method returning the
																	// original SINGLETON

		return SINGLETON;

	}

	public static void main(String[] args) {

		try {

			SingletonCloningSolution singleton1 = SingletonCloningSolution.getInstance();

			System.out.println("singleton1 hashCode: "

					+ singleton1.hashCode()); // the has code value printed is 366712642

			SingletonCloningSolution singleton2 = (SingletonCloningSolution) singleton1.clone();

			System.out.println("singleton2 hashCode: "

					+ singleton2.hashCode()); // the has code value printed is 366712642

		} catch (Exception ex) {

			System.out.println(ex);

		}

	}

}
