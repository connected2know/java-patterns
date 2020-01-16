package main.java.template;

public abstract class Workout {
	
	
	public void makeWorkout() {
		warmOut();
		workOutExercises();
		stretch();
	}
	
	public void warmOut() {
		System.out.println("Warmup done!");
	}

	public abstract void workOutExercises();
	
	public void stretch() {
		System.out.println("Stretch done!");
	}
}
