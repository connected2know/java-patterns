package main.java.adapter;

public class SystemsArchitect implements Architect{

	@Override
	public String defineRole() {
		return "I design systems";
	}

	@Override
	public String defineArchitecture() {
		return "Draw plan for a new system";
	}

}
