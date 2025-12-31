package com.languagefundamentals;

import java.util.Scanner;

public class TaskForLoop4 {

	static void factorial(int n) {
		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + n + " is: " + fact);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		factorial(num);
		sc.close();
	}

}
