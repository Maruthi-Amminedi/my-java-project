package com.languagefundamentals;

import java.util.Scanner;

public class TaskForLoop1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Enter your name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for (int i = 0; i <= 100; i++) {

			System.out.println(name);
		}
		sc.close();
	}

}
