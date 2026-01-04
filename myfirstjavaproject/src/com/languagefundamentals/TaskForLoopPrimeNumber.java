package com.languagefundamentals;

import java.util.Scanner;

public class TaskForLoopPrimeNumber {
	static void checkprimenumber(int n) {
		int count = 0;
		if (n <= 1) {
			System.out.println("Not a prime numer");
			return;

		}
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;

			}
		}
		if (count == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		checkprimenumber(num);
		System.out.println("Main Method Ended");
		sc.close();
	}

}
