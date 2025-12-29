package com.javaproject;

public class Customer1 {
	int cid;
	String cname;
	int cage;

	Customer1() {
		this(12);
		System.out.println("no arg constructor called");

	}

	Customer1(int cid) {
		this(cid, "maruthi");
		System.out.println("one arg constructor called");
	}

	Customer1(int cid, String cname) {
		this(cid, cname, 23);

		System.out.println("two arg constructor called");

	}

	Customer1(int cid, String cname, int cage) {
		System.out.println("three arg constructor called");
		this.cid = cid;
		this.cname = cname;
		this.cage = cage;
		this.display();
//		System.out.println("Customer id:" + cid);
//		System.out.println("Customer name :" + cname);
//		System.out.println("Customer age:" + cage);

	}

	void display() {
		System.out.println("Customer id:" + cid);
		System.out.println("Customer name :" + cname);
		System.out.println("Customer age:" + cage);

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Customer1 c = new Customer1();

		System.out.println("main method ended");

	}

}
