package com.languagefundamentals;

import java.util.Scanner;

public class LabTaskForLoop2 {
	static void sumofalldigits(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;

		}
		System.out.println("sum of digits:" + sum);
	}

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sumofalldigits(num);
		sc.close();

	}

}
