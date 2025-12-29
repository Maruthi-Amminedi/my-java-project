package com.javaproject;

public class TestMethodDemo2 {

	static void addition(int a, int b) {
		a = 30;
		b = 45;
		int c = a + b;
		System.out.println("Addition =" + c);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestMethodDemo2.addition(10, 20);
		System.out.println("main method ended");

	}

}
