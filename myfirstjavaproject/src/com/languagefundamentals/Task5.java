package com.languagefundamentals;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter week number");
		int weeknumber = sc.nextInt();

		switch (weeknumber) {
		case 0:
			System.out.println("SUNDAY FUNDAY");
			break;
		case 1:
			System.out.println("Monday Lazy Day");
			break;
		case 2:
			System.out.println("Tuesday normal day");
			break;
		case 3:
			System.out.println("Wednesday, thursday, fridat are normal days");
			break;
		case 4:
			System.out.println("Saturday Weekend start");
			break;
		default:
			System.out.println("Death day");

		}
		sc.close();
	}

}
