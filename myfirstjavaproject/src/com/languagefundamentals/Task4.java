package com.languagefundamentals;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		System.out.println("Welcome to naukari based small application");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");
		String name = sc.next();

		System.out.println("Enter your age");
		int age = sc.nextInt();
		if (age >= 40) {
			System.out.println("you are not eligible");
		}

		System.out.println("Enter your College Name");
		sc.nextLine();
		String collegename = sc.nextLine();

		System.out.println("Enter your B.TECH percentage");
		double btech = sc.nextDouble();

		if (btech >= 70 && btech <= 100) {
			System.out.println("B.TECH eligible");

			System.out.println("Enter your Intermediate percentage");
			double intermediate = sc.nextDouble();

			if (intermediate >= 60 && intermediate <= 100) {
				System.out.println("Intermediate eligible");

				System.out.println("Enter your 10th percentage");
				double tenth = sc.nextDouble();

				if (tenth >= 60 && tenth <= 100) {
					System.out.println("You are fully eligible");
				} else {
					System.out.println("Not eligible due to 10th percentage");
				}

			} else {
				System.out.println("Not eligible due to Intermediate percentage");
			}

		} else {
			System.out.println("Not eligible due to B.TECH percentage");
			sc.close();
		}

	}
}
