package com.tnsif.vvit;

public class Customer {



	private String CustomerName;
	private int CustomerId;
	private String CustomerCity;
	
	
	//default customer() {
	public Customer() {

}

	//parameterized constructor
	public customer(String CustomerName, int CustomerId, String CustomerCity) {
	
		this.CustomerName = CustomerName;
	    this.CustomerId = CustomerId;
	    this.CustomerCity= CustomerCity;
}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String CustomerName) {
		this.FCustomerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	} 
}
		  
	