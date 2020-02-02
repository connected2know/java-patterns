package main.java.proxy;

public class CustomerDetailsProxy implements Customer {
	
	private Integer customerIdentifier;
	
	private CustomerDetails customerDetails;
	
	public CustomerDetailsProxy(Integer customerIdentifier) {
		this.customerIdentifier = customerIdentifier;
		this.customerDetails = new CustomerDetails(customerIdentifier);
	}
	
	
	public Integer getCustomerIdentifier() {
		return customerIdentifier;
	}

	@Override
	public String getCustomerName() {
		return this.customerDetails.getCustomerName();
	}

	@Override
	public Integer getCustomerAge() {
		return this.customerDetails.getCustomerAge();
	}

	@Override
	public String getCustomerAddress() {
		return "Not Available";
	}

	@Override
	public String getCustomerPhoneNumber() {
		return "Not Available";
	}

}
