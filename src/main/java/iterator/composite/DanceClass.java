package main.java.iterator.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class DanceClass extends DanceComponent{
	ArrayList<DanceComponent> dancingComponents = new ArrayList<>();
	String name;
	String description;
	
	public DanceClass(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	@Override
	public void add(DanceComponent danceComponent) throws DanceOperationException {
		dancingComponents.add(danceComponent);
	}
	
	@Override
	public void remove(DanceComponent danceComponent) throws DanceOperationException {
		dancingComponents.remove(danceComponent);
	}

	@Override
	public DanceComponent get(int position){
		return dancingComponents.get(position);
	}
	
	@Override
	public void printInfo() throws DanceOperationException {
		System.out.println("Class name: " + this.name);
		System.out.println("Class description: " + this.description);
		System.out.println(".......................");
		printComponentsInfo();
	}
	
	protected void printComponentsInfo() throws DanceOperationException {
		Iterator<DanceComponent> iterator =  dancingComponents.iterator();
		
		while(iterator.hasNext()) {
			DanceComponent component = iterator.next();
			component.printInfo();
			
		}
	}

}
