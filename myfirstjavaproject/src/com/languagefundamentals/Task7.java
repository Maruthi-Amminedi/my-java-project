package com.languagefundamentals;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		System.out.println("Enter Faculty name and know about them");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		switch (name) {
		case "maruthi" -> System.out.println("Head of the EEE Departmetn(HOD)");
		case "prasnna" -> System.out.println("Head of the ECE Department(HOD)");
		case "suresh" -> System.out.println("one of the faculty from EEE department");
		case "Ramesh" -> System.out.println("one of the faculty from ece department");
		default -> System.out.println("No data found");
		}
		sc.close();

	}

}
