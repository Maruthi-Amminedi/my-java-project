package com.languagefundamentals;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Shoe size");
		int shoesize = sc.nextInt();
		switch (shoesize) {
		case 7 -> System.out.println("It is small size ");
		case 8 -> System.out.println("It is medium size");
		case 9 -> System.out.println("It is Big size");
		case 10 -> System.out.println("It is large size");
		case 11 -> System.out.println("It is extra large size");
		default -> System.out.println("your size not available");

		}
		sc.close();
	}

}
