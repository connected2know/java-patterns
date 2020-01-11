package main.java.adapter;

public class AdapterMain {

	public static void main(String[] args) {
		
		SystemsArchitect systemsArchitect = new SystemsArchitect();
		FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
		Developer architectAdapter = new ArchitectAdapter(systemsArchitect); 
		System.out.println("The systems architect role is :" + systemsArchitect.defineRole());
		System.out.println("The frontend developer role is :" + frontEndDeveloper.defineRole());
		System.out.println("The adapter developer role is :" + architectAdapter.defineRole());
	}

}
