package com.languagefundamentals;

import java.util.Scanner;

public class TaskForLoop5 {

	static void perfectNumber(int n) {
		int sum = 0;

		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == n) {
			System.out.println(n + " is a Perfect Number");
		} else {
			System.out.println(n + " is not a Perfect Number");
		}
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		perfectNumber(num);
		sc.close();
	}
}
