package main.java.template;

public abstract class Workout {
	
	
	 public final void makeWorkout() {
		warmUp();
		workOutExercises();
		stretch();
	}
	
	public void warmUp() {
		System.out.println("Warmup done!");
	}

	public abstract void workOutExercises();
	
	public void stretch() {
		System.out.println("Stretch done!");
	}
}
