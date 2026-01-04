package com.languagefundamentals;

import java.util.Scanner;

public class LabTaskForLoop1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number");
		int num = sc.nextInt();

		System.out.println("Enter digit");
		int digit = sc.nextInt();

		int count = 0;

		for (; num > 0; num = num / 10) {
			if (num % 10 == digit) {
				count++;
			}
		}

		System.out.println("Count = " + count);
		sc.close();
	}
}
