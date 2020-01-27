package main.java.composite;

public class WorkshopInfo {
	
	public static void main(String[] args) {
			
		try {
			DanceStep basicSalsa = new DanceStep("Basic salsa","Forward 1,2, 3. Back 5,6, 7",1);
			DanceStep crossBodySalsa = new DanceStep("Cross Body Lead", "1,2, Side, side, 6, 7",2);
			DanceStep stylingSalsa1 = new DanceStep("Stiling move 1","Harm stile",2);
			
			DanceComponent salsaClass = new DanceClass("Salsa class", "1 hour salsa class");
			salsaClass.add(basicSalsa);
			salsaClass.add(crossBodySalsa);
			
			DanceComponent salsaStyle = new DanceClass("Salsa style", "30 mins styling");
			salsaStyle.add(stylingSalsa1);
			
			salsaClass.add(salsaStyle);
			
			DanceWorkshop danceWorkshop = new DanceWorkshop(salsaClass);
			danceWorkshop.printWorkshopInfo();
		
		}catch(Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
		
	}
	
	

}
