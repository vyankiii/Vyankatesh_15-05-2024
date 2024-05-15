package com.typesOfFields;

public class Employee {

	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	private double employeeSalary;

	public static String countryName;

	static {
		countryName = "Bharat";
	}

	public Employee(int employeeId, String employeeName, String employeeDesignation, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeSalary = employeeSalary;
	}

	public void getEmployee() {
		System.out.println(this.employeeId);
		System.out.println(this.employeeName);
		System.out.println(this.employeeDesignation);
		System.out.println(this.employeeSalary);
	}

	public static void getEmployeeCountryName() {
		System.out.println(countryName);
	}

}
