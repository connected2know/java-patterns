package main.java.command;

public class WifiController {
	
	Command command;
	
	public WifiController() {}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeAction() {
		this.command.execute();
	}
	
	public void undoAction() {
		this.command.undo();
	}

}
