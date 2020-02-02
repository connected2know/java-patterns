package main.java.proxy;

final class CustomerDetails implements Customer{
	
	private Integer customerIdentifier;
	
	private String name;
	
	private Integer customerAge;
	
	private String customerAddress;
	
	private String customerPhoneNumber;
	
	CustomerDetails(Integer customerIdentifier){
		this.customerIdentifier = customerIdentifier;
		this.getCustumerDetails(this.customerIdentifier);
	}
	
	void getCustumerDetails(Integer identifier) {
		
		// We can call a REST or DB service to file the information but here we will use a sample test dummy info. 
		
		this.name="Jones Brian";
		this.customerAge=37;
		this.customerAddress="Flat 3, Street test";
		this.customerPhoneNumber = "+2123443432";
	}

	@Override
	public String getCustomerName() {
		return this.name;
	}

	@Override
	public Integer getCustomerAge() {
		return this.customerAge;
	}

	@Override
	public String getCustomerAddress() {
		return this.customerAddress;
	}

	@Override
	public String getCustomerPhoneNumber() {
		return this.customerPhoneNumber;
	}

}
