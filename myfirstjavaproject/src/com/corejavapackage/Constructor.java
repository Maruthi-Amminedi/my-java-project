package com.corejavapackage;

public class Constructor {
	int sid;
	String sname;

	Constructor() {
		System.out.println("no arg constructor called");
		sid = 18;
		sname = "maruthi";
	}

	Constructor(int sid, String sname) {
		System.out.println("parameterized constructor called");
		this.sid =sid;
		this.sname=sname;

	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(21,"amminedi");
		c1.show();
		c.show();
		System.out.println("main method ended");
	}

	void show() {
		System.out.println("student id = " + sid);
		System.out.println("Student name=" + sname);
	}
}
