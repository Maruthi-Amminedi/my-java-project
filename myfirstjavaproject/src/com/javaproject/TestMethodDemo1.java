package com.javaproject;
//calculator program

public class TestMethodDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		TestMethodDemo1 t = new TestMethodDemo1();
		t.add();
		t.sub();
		t.mul();
		t.div();
		t.moduls();
		System.out.println("main method started");

	}

	void add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Additon:" + c);
	}

	void sub() {
		int a = 25;
		int b = 10;
		int d = a - b;
		System.out.println("Subtration:" + d);
	}

	void mul() {
		int x = 25;
		int y = 15;
		int z = (x * y);
		System.out.println("multification:" + z);
	}

	void div() {
		int p = 25;
		int q = 5;
		int r = (p / q);
		System.out.println("division:" + r);
	}

	void moduls() {
		int a1 = 45;
		int a2 = 15;
		int a3 = (a1 / a2);
		System.out.println("Modulus:" + a3);
	}
}
