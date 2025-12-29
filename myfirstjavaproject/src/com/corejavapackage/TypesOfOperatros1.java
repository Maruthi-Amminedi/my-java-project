package com.corejavapackage;

import java.util.Scanner;

public class TypesOfOperatros1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value=");
		int a = sc.nextInt();
		System.out.println("Enter b value=");
		int b = sc.nextInt();
		System.out.println("Addition of two numbers=" + (a + b));
		System.out.println("Subtraction of two numbers=" + (a - b));
		System.out.println("Mutiplication of two numbers = " + a * b);
		System.out.println("Division of two numbers=" + a / b);
		System.out.println("Modulus of two numbers=" + a % b);
		System.out.println("main method ended");

	}

}
