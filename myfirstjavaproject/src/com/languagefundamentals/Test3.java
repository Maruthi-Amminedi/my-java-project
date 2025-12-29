package com.languagefundamentals;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		if (age > 100) {
			System.out.println("Does not exist");

		} else if (age >= 75 && age <= 99) {
			System.out.println("you are a old person");

		} else if (age >= 50 && age <= 75) {
			System.out.println("you are a uncle or aunty ");
		} else if (age >= 25 && age <= 30) {
			System.out.println("you are youth ");
		} else if (age >= 2 && age <= 24) {
			System.out.println("you are children");
		} else {
			System.out.println("main method ended");
		}
		sc.close();

	}

}
