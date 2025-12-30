package com.languagefundamentals;

import java.util.Scanner;

public class TaskForLoop3 {
	static void factors(int num) {
		for (int i = 1; i <= num/2; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println(num);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		factors(n);

	}

}