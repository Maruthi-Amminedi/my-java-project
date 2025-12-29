package com.javaproject;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name :");
		String nm = sc.next();
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		System.out.println("Enter your phone");
		Long phone = sc.nextLong();

		name(nm);
		age(age);
		phone(phone);
		System.out.println("main method ended");

	}

	static void name(String Sname) {
		System.out.println("User name :" + Sname);
	}

	static void age(int age) {
		System.out.println("User age : " + age);
	}

	static void phone(Long phone) {
		System.out.println("User phone:" + phone);
	}
}
