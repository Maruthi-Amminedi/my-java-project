package com.languagefundamentals;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if (num >= 18 && num <= 25) {
			System.out.println("you are eligible for voting");
		} else
			System.out.println("you are not eligible for voting");
		sc.close();

	}

}
