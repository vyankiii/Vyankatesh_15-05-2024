package com.instanceOf;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();// create object
		c1.getCustomerDetails();// call getCustomerDetails Method
		System.out.println(c1 instanceof Customer);// check instanceof operator

		Student s1 = new Student(); // create object and call the constructor of student class
		System.out.println(s1 instanceof Student);// check instanceof operator

		System.out.println(c1 instanceof Object);

	}

}