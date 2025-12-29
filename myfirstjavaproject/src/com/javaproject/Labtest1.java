package com.javaproject;

import java.util.Scanner;

public class Labtest1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String nm = sc.next();
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		System.out.println("Enter your phone : ");
		Long phone = sc.nextLong();

		System.out.println("main method ended");
		getName(nm);
		getAge(age);
		
	}

	static void getName(String sname) {
		System.out.println("user Name : " + sname);
	}

	static void getAge(int age) {
		System.out.println("user Age : " + age);

	}

	static void getphone(int Long) {
		System.out.println("user phone :" + Long);

	}
}
