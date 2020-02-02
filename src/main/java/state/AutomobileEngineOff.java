package main.java.state;

public class AutomobileEngineOff implements State{
	
	private Automobile automobile;
	
	public AutomobileEngineOff(Automobile automobile) {
		this.automobile = automobile;
	}

	@Override
	public void turnRightKey() {
		System.out.println("Engine turned On!");
		automobile.setCurrentState(automobile.getAutomobileEngineOn());
	}

	@Override
	public void turnLeftKey() {
		System.out.println("You cannot turn the key left. Engine is already turned off.");
	}

}
