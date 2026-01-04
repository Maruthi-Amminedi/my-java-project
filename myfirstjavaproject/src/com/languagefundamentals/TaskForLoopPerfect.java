package com.languagefundamentals;

import java.util.Scanner;

public class TaskForLoopPerfect {
	static void Perfectnumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum = sum + i;
		}
		if (sum == n) {
			System.out.println("perfect number");
		} else {
			System.out.println("Not a perfect number");
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Perfectnumber(num);
		sc.close();
	}

}
