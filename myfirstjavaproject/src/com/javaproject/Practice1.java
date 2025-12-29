package com.javaproject;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String uname = sc.next();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Enter your mobile number");
		long phone = sc.nextLong();
		getname(uname);
		getage(age);
		getphone(phone);
		System.out.println("main metho ended");

	}

	static void getname(String sname) {
		System.out.println("user name:" + sname);
	}

	static void getage(int age) {
		System.out.println("user age:" + age);
	}

	static void getphone(long phone) {
		System.out.println("user mobile number:" + phone);
	}
}
