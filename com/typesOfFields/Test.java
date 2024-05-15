package com.typesOfFields;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("...Non-static methods needs object creation...");

		Employee employee1 = new Employee(1, "Pooja", "Software Engineer", 289030.33);
		employee1.getEmployee();

		System.out.println("...static methods no need object creation...");

		Employee.countryName = "Japan";
		Employee.getEmployeeCountryName();

	}

}
