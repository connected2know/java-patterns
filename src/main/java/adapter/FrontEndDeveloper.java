package main.java.adapter;

public class FrontEndDeveloper implements Developer{

	@Override
	public String defineRole() {
		return "I create applications";
	}

	@Override
	public String defineImplementation() {
		return "Implement modules for a new application";
	}

}
