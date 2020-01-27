package main.java.composite;

public class DanceWorkshop {
	DanceComponent allClasses;
	
	public DanceWorkshop(DanceComponent allClasses) {
		this.allClasses = allClasses;
	}
	
	public void printWorkshopInfo() throws DanceOperationException {
		this.allClasses.printInfo();
	}
	
}
