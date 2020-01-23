package main.java.iterator.custom;

public class HistoryBook {
	
	private String name;
	
	private String description;
	
	private int level;
	
	public HistoryBook(String name, String description,int level) {
		this.name = name;
		this.description=description;
		this.level = level;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getLevel() {
		return level;
	}
	
	

}
