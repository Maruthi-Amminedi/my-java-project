package com.languagefundamentals;

import java.util.Scanner;

public class TaskForLoop6EVEN {
	static void even(int n) {
		for (int i = 100; i >= 0; i--) {
			if (i % 2 != 0) {
				System.out.println("Even numbers are:" + i);

			}

		}
	}

	public static void main(String[] args) {
		System.out.println("Enter your number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		even(num);
		sc.close();

	}

}
