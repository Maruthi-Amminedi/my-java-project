package com.corejavapackage;

import java.util.Scanner;

public class EmployeSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary");
		double basicsalary = sc.nextDouble();
		System.out.println("Enter bonus");
		double bonus = sc.nextDouble();
		System.out.println("Enter Deduction");
		double deduction = sc.nextDouble();
		System.out.println("Enter total working days");
		int totalworkingdays = sc.nextInt();
		System.out.println("Enter working days");
		int workingdays = sc.nextInt();
		double grosssalary = basicsalary + bonus;
		double netsalary = grosssalary - deduction;
		double perDaysalary = basicsalary / totalworkingdays;
		double earnedsalary = perDaysalary * workingdays;
		int remainingDays = totalworkingdays % workingdays;
		System.out.println("salary details**********");
		System.out.println("Gross salary :" + grosssalary);
		System.out.println("Net salary :" + netsalary);
		System.out.println("Perdaysalary :" + perDaysalary);
		System.out.println("Earnedsalary:" + earnedsalary);
		System.out.println("Remainig days:" + remainingDays);
		System.out.println("*****************************");
		sc.close();
	}

}
