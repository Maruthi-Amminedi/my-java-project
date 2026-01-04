package com.languagefundamentals;

import java.util.Scanner;

public class TastForLoopFactorial {
	static void Factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println("Factorial of given number is:" +  fact);

	}

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Factorial(num);
		sc.close();

	}

}
