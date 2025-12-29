package com.javaproject;

public class Employee {
	int empid = 20458;
	String empname = "rahul";
	static double salary = 14125;

	{

		salary = salary + (salary * 0.10);
		System.out.println("Employee id = " + empid);
		System.out.println("Employee name =" + empname);
		System.out.println("Employee salary = " + salary);

	}

	public static void main(String[] args) {

		Employee E = new Employee();
		Employee E1 = new Employee();
		Employee E2 = new Employee();
	}

}
