package com.javaproject;

public class Variables_1 {
	int a = 10;
	int b = 25;
	void add() {
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Variables_1 v1 = new Variables_1();
		System.out.println(v1.a);
		System.out.println(v1.b);
		v1.add();
	
	}

}
