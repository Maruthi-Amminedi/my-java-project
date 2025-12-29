package com.javaproject;

import java.util.Scanner;

public class Method1 {
	static void ascii(char ch) {

		System.out.println("Ascii value:" + (int) ch);
	}

	static void ascii(int age) {
		System.out.println("Ascii value:" + (char) age);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character:");
		char ch = sc.next().charAt(0);
		System.out.println("Enter number:");
		int age = sc.nextInt();
		ascii(ch);
		ascii(age);

	}

}
