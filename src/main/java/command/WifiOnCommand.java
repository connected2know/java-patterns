package main.java.command;

public class WifiOnCommand implements Command{
	
	Wifi wifi;
	
	public WifiOnCommand(Wifi wifi) {
		this.wifi = wifi;
	}

	@Override
	public void execute() {
		this.wifi.on();
	}

	@Override
	public void undo() {
		this.wifi.off();
	}

}
