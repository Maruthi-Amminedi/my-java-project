package com.javaproject;
//No return type and no arguments

public class TestMethodDemo {

	void hello() {
		System.out.println("hello method called");

	}

	void maruthi() {
		System.out.println("maruthi taking course at V cube");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		TestMethodDemo t = new TestMethodDemo();
		t.hello();
		t.maruthi();
		TestMethodDemo.vcube();
		System.out.println("main method ended");
	}

	static void vcube() {
		int a = 10;
		int b = 20;
		int c = a;
		int d = c + a;
		int e = (byte) a;
		System.out.println(d);
		System.out.println(b);
		System.out.println(a);
		System.out.println("calculation program");
	}

}
