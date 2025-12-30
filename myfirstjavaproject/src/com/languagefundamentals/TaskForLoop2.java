package com.languagefundamentals;


import java.util.Scanner;

public class TaskForLoop2 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter a number");

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		for (; i >=0 ; i--) {
//			System.out.println(i + " ");

			if (i % 2 != 0) {
				System.out.println(i + " ");
				
			}
			
		}
		System.out.println("main method ended");
	}

}
