package com.javaproject;

public class Demo2 {
	int a = 10;
	int b = 20;
	void add() {
		int addition = (a+b);
		System.out.println(addition);
	}
	void sub() {
		int subtraction = (a-b);
		System.out.println(subtraction);
	}
	void mul() {
		int multiplication  = (a*b);
		System.out.println(multiplication);
	}
	void div() {
		int division = (a/b);
		System.out.println(division);
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Demo2 obj = new Demo2();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		
	
	}

}
