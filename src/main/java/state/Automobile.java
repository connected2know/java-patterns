package main.java.state;

public class Automobile {
	
	private State automobileEngineOff;
	private State automobileEngineOn;
	
	private State currentState;
	
	public Automobile() {
		automobileEngineOff = new AutomobileEngineOff(this);
		automobileEngineOn = new AutomobileEngineOn(this);
		currentState = automobileEngineOff;
	}
	
	public void turnRightKey() {
		currentState.turnRightKey();
	}
	
	public void turnLeftKey() {
		currentState.turnLeftKey();
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public State getAutomobileEngineOff() {
		return automobileEngineOff;
	}

	public State getAutomobileEngineOn() {
		return automobileEngineOn;
	}
	
	
}
