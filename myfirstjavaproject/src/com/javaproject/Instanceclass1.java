package com.javaproject;

public class Instanceclass1 {
	String name;
	int age;
	String from;
	float f;

	public static void main(String[] args) {
		System.out.println("main method started");
		Instanceclass1 I1 = new Instanceclass1();
		System.out.println("name = " + I1.name);
		System.out.println("age = " + I1.age);
		System.out.println("from = " + I1.from);
		System.out.println("float value ="+I1.f);
		System.out.println("main method ended");

	}

}
