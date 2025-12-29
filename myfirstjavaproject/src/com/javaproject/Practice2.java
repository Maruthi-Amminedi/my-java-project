package com.javaproject;

public class Practice2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Practice2 p = new Practice2();
		double sal = p.salaryinfo();
		double bon = p.getbonusinfo();
		System.out.println("bonus = " + (sal + bon));
		System.out.println("main method ended");

	}

	double salaryinfo() {
		double salary = 100000.00;
		return salary;
	}

	double getbonusinfo() {
		double bonus = 20000;
		return bonus;
	}
}