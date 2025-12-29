package com.javaproject;

public class TestClass1 {

	public static void main(String[] args) {
		int f = 98;
		double c = (f - 32) * 5 / 9;
		System.out.println("celcius :" + c);
		int F = (int) (c * 9 / 5) + 32;
		System.out.println("Farehinheat :" + F);
		int a = (int) c;
		System.out.println("integer value : " + a);
	}

}
