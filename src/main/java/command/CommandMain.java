package main.java.command;

public class CommandMain {

	public static void main(String[] args) {
		WifiController wifiController = new WifiController();
		Wifi wifi = new Wifi();
		WifiOffCommand wifiOffCommand = new WifiOffCommand(wifi);
		WifiOnCommand wifiOnCommand = new WifiOnCommand(wifi);
		wifiController.setCommand(wifiOnCommand);
		wifiController.executeAction();
		wifiController.setCommand(wifiOffCommand);
		wifiController.executeAction();
		wifiController.undoAction();
	}

}
