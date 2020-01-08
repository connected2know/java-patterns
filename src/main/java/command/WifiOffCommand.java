package main.java.command;

public class WifiOffCommand implements Command{

	Wifi wifi;
	
	public WifiOffCommand(Wifi wifi) {
		this.wifi = wifi;
	}

	@Override
	public void execute() {
		this.wifi.off();
	}

	@Override
	public void undo() {
		this.wifi.on();
	}

}
