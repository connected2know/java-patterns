package main.java.composite;

public class DanceStep extends DanceComponent{
	
	private String moveName;
	
	private String moveDescription;
	
	private int moveLevel;
	
	public DanceStep(String moveName, String moveDescription, int moveLevel) {
		this.moveName = moveName;
		this.moveDescription = moveDescription;
		this.moveLevel = moveLevel;
	}

	@Override
	public String getMoveName() {
		return moveName;
	}

	@Override
	public String getMoveDescription() {
		return moveDescription;
	}

	@Override
	public int getMoveLevel() {
		return moveLevel;
	}
	
	@Override
	public void printInfo(){
		System.out.println("Move name: " + this.moveName);
		System.out.println("Move description: " + this.moveDescription);
		System.out.println("Move level: " + this.moveLevel);
		System.out.println(".......................");
	}
	
	

}
