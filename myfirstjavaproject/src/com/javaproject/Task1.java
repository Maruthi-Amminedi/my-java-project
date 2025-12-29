package com.javaproject;

public class Task1 {
	static int count = 0;

	Task1() {
		count++;
	}

	public static void main(String[] args) {
		new Task1();
		new Task1();
		new Task1();
		new Task1();
		new Task1();
		System.out.println("No of objects : " + count++);

	}

}
