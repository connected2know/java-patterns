package main.java.template;

public class TemplateMain {

	public static void main(String[] args) {
		RunWorkout runWorkout = new RunWorkout();
		GymWorkout gymWorkout = new GymWorkout();

		System.out.println("Run Workout...");
		runWorkout.makeWorkout();
		
		System.out.println("\n");
		
		System.out.println("Gym Workout...");
		gymWorkout.makeWorkout();
	}

}
