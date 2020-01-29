package main.java.state;

public class AutomobileEngineOn implements State{
	
	private Automobile automobile;
	
	public AutomobileEngineOn(Automobile automobile) {
		this.automobile = automobile;
	}

	@Override
	public void turnRightKey() {
		System.out.println("You cannot turn key right. Engine is already turned On.");
	}

	@Override
	public void turnLeftKey() {
		System.out.println("Engine turned Off!");
		automobile.setCurrentState(automobile.getAutomobileEngineOff());
	}

}
