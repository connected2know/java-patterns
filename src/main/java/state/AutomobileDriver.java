package main.java.state;

public class AutomobileDriver {

	public static void main(String[] args) {
		Automobile automobile = new Automobile();
		
		System.out.println("First test...");
		automobile.turnRightKey();
		automobile.turnLeftKey();
		
		System.out.println("Second test...");
		System.out.println("\n");
		
		automobile.turnRightKey();
		automobile.turnRightKey();		
		automobile.turnLeftKey();
		automobile.turnLeftKey();
		
	}

}
