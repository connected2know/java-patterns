package factoryclass;

public class FactoryClass { // top-level class were we will create all necessary entities to show the
							// factory class design pattern

	enum AnimalType { // enum that contains the identifiers of different animal types

		CAT, DOG

	}

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

	static class FactoryPatternClass { // Factory class. This class will produce animals

		public static Animal getAnimalFromEnum(AnimalType animalType) { // Factory method. This method receives an
																		// AnimalType of type Enum and according with
																		// that value will produce a different type of
																		// Animal

			Animal animal = null;

			if (AnimalType.CAT.equals(animalType)) { // a Cat Animal will be produced if the enum entry has the value
														// CAT

				animal = new Cat();

			} else if (AnimalType.DOG.equals(animalType)) { // a Dog Animal will be produced if the enum entry has the
															// value DOG

				animal = new Dog();

			}

			return animal;

		}

	}

	public static void main(String[] args) { // main method. Let's test the Factory class

		Animal animal1 = FactoryPatternClass.getAnimalFromEnum(AnimalType.DOG); // creation of an Animal calling the
																				// factory class with enum type DOG

		System.out.println(animal1.getAnimalTypeName()); // will print "DOG" because is what we defined in the
															// getAnimalTypeName method of Dog class

		Animal animal2 = FactoryPatternClass.getAnimalFromEnum(AnimalType.CAT); // creation of an Animal calling the
																				// factory class with enum type CAT

		System.out.println(animal2.getAnimalTypeName()); // will print "CAT" because is what we defined in the
															// getAnimalTypeName method of Cat class

	}

}
