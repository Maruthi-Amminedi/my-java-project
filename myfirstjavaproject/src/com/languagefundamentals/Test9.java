package com.languagefundamentals;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int price = 0;
		int total = 0;
		char again;

		do {
			System.out.println("Select your Fav : Fruits or Vegetables");
			String Fav = sc.next();

			switch (Fav) {

			case "Fruits" -> {
				System.out.println("Enter fruit name");
				String Fruit = sc.next();

				switch (Fruit) {
				case "mango" -> {
					System.out.println("2 mangoes cost are 100");
					price = 100;
				}
				case "apple" -> {
					System.out.println("1 apple cost is 100");
					price = 100;
				}
				case "bananna" -> {
					System.out.println("12 bananas cost are 100");
					price = 100;
				}
				case "grapes" -> {
					System.out.println("Half kg grapes cost are 100");
					price = 100;
				}
				case "watermelon" -> {
					System.out.println("One big watermelon cost is 100");
					price = 100;
				}
				default -> {
					System.out.println("Entered wrong fruits name");
					price = 0;
				}
				}
			}

			case "Vegetables" -> {
				System.out.println("Enter Vegetable name");
				String Vegname = sc.next();

				switch (Vegname) {
				case "Tamato" -> {
					System.out.println("1 kg tomato is 60 rupees");
					price = 60;
				}
				case "Beans" -> {
					System.out.println("1 kg Beans is 40 rupees");
					price = 40;
				}
				case "Mirchi" -> {
					System.out.println("1 kg Mirchi is 20 rupees");
					price = 20;
				}
				case "Potato" -> {
					System.out.println("1 kg Potato is 150 rupees");
					price = 150;
				}
				case "Brinjal" -> {
					System.out.println("1 kg Brinjal is 140 rupees");
					price = 140;
				}
				default -> {
					System.out.println("Entered wrong vegetable name");
					price = 0;
				}
				}
			}

			default -> {
				System.out.println("Entered wrong category");
				price = 0;
			}
			}

			total = total + price;

			System.out.println("Do you want to continue shopping? (y/n)");
			again = sc.next().charAt(0);

		} while (again == 'y' || again == 'Y');

		System.out.println("Total Cost = " + total);
		System.out.println("Thank you for shopping");
		sc.close();
	}
}
