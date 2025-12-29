package com.corejavapackage;

public class Employee1 {

	int empId;
	String name;
	double salary;
	static String companyName = "TechSoft Pvt Ltd";

	Employee1(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	Employee1(Employee1 e) {
		this.empId = e.empId;
		this.name = e.name;
		this.salary = e.salary;

	}

	public static void main(String[] args) {

		System.out.println("main method started");

		Employee1 e1 = new Employee1(101, "Arjun", 30000);

		Employee1 e2 = new Employee1(e1);

		e2.salary = 45000;

		System.out.println("Original Employee:");
		e1.display();

		System.out.println("Copied Employee:");
		e2.display();

		System.out.println("main method ended");
	}

	void display() {
		System.out.println(empId);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(companyName);
		System.out.println("****************");
	}
}
