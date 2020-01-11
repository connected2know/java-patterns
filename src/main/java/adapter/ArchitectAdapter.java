package main.java.adapter;

public class ArchitectAdapter implements Developer{
	
	Architect architect;
	
	public ArchitectAdapter(Architect architect) {
		this.architect =architect;
	}

	@Override
	public String defineRole() {
		return this.architect.defineRole() + " but ready to do developments if necessary";
		
	}

	@Override
	public String defineImplementation() {
		return "Not able to do this task yet";
	}

}
