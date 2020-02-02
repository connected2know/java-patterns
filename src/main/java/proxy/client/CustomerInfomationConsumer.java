package main.java.proxy.client;

import main.java.proxy.CustomerDetailsProxy;

public class CustomerInfomationConsumer {

	public static void main(String[] args) {
		
		// CustomerDetails CustomerDetails = new CustomerDetails();
		
		CustomerDetailsProxy customerDetails = new CustomerDetailsProxy(123);
		
		System.out.println("Printing customer info:");
		
		System.out.println("Printing customer name: " + customerDetails.getCustomerName());
		
		System.out.println("Printing customer age: " + customerDetails.getCustomerAge());
		
		System.out.println("Printing customer address: " + customerDetails.getCustomerAddress());
		
		System.out.println("Printing customer phone number: " + customerDetails.getCustomerPhoneNumber());

	}

}
