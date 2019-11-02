package factoryclass;

public class AbstractFactoryMethod { // top-level class were we will create all necessary entities to show the
										// factory abstract method design pattern

	interface Animal { // interface that defines an animal with a method that will return the animal
						// type name

		public String getAnimalTypeName();

	}

	static class Cat implements Animal { // class that implements Animal and defines a Cat

@Override

public String getAnimalTypeName() { // override of animal type name, returning in this case "CAT"




return "CAT";




}

	}

	static class Dog implements Animal { // class that implements Animal and defines a Dog

		@Override

		public String getAnimalTypeName() { // override of animal type name, returning in this case "DOG"

			return "DOG";

		}

	}

	static abstract class AnimalProducer { // abstract class that contains the abstract factory method

		abstract public Animal getAnimalType(); // abstract factory method that needs to be override 

	}

	static class CatProducer extends AnimalProducer { // extending the abstract class that contains the factory abstract
														// method 

		@Override

		public Animal getAnimalType() { // override of the abstract factory method, returning in the case a Cat 

			return new Cat();

		}

	}

	static class DogProducer extends AnimalProducer { // extending the abstract class that contains the factory abstract
														// method 

		@Override

		public Animal getAnimalType() { // override of the abstract factory method, returning in the case a Dog

			return new Dog();

		}

	}

	public static void main(String[] args) { // let's test in the main method the abstract factory method

		AnimalProducer animal1 = new CatProducer(); // creation of an AnimalProducer of type CatProducer 

		System.out.println(animal1.getAnimalType().getAnimalTypeName()); // will print "CAT"

		AnimalProducer animal2 = new DogProducer(); // creation of an AnimalProducer of type DogProducer

		System.out.println(animal2.getAnimalType().getAnimalTypeName()); // will print "DOG"

	}

}
