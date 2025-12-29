package com.javaproject;

public class Task2 {
	void employe1() {
		String name;
		int salary;
		System.out.println("main method started");
	}

	void employe2() {
		String name = "sai shreeth";
		int salary;
		System.out.println("employe 2 called");
		System.out.println("name of employee:" + name);

	}

	public static void main(String[] args) {
		Task2 t = new Task2();
		System.out.println("main method ended");
		System.out.println("employee 1 details ");
		t.employe1();
		t.employe2();

	}

}
