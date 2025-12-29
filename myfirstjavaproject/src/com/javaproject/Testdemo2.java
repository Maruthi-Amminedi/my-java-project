package com.javaproject;

public class Testdemo2 {

	static void m() {
		System.out.println("sai ram");
	}

	static void m1() {
		System.out.println("sai ");
		m();
	}

	void i() {
		System.out.println(" ram");
		m1();
	}

	void i1() {
		System.out.println(" ram sai");
		i();
	}

	static {

		new Testdemo2().i1();

	}

	public void main(String[] args) {

	}

}
