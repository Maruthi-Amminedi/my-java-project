package com.languagefundamentals;

import java.util.Scanner;

public class TaskForLoopFactors {
	static void Factors(int n) {
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		
		}
		System.out.println(n);
	}

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Factors(num);
		sc.close();

	}

}
