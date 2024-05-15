package com.instanceOf;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerContactNo;
	private String customerAddress;

	public Customer() {
		customerId = 1;
		customerName = "Suresh";
		customerContactNo = 8737837829l;
		customerAddress = "Nashik";
	}

	public void getCustomerDetails() {
		System.out.println(customerId);
		System.out.println(customerName);
		System.out.println(customerContactNo);
		System.out.println(customerAddress);
	}

}
