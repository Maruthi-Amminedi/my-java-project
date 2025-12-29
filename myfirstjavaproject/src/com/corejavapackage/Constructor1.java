package com.corejavapackage;

public class Constructor1 {
	int sid;
	String sname;
	int sage;
	long phone;

	Constructor1() {
		System.out.println("no arg constructor");
		sid = 215;
		sname = "maruthi";
		sage = 23;
		phone = 9346054781l;

	}

	Constructor1(int id) {

		System.out.println("Parameterized Constructor called");
//		int id = sid;
		sid = id;

	}

//	Constructor1(int sid, String sname) {
//		this(206);
	////		System.out.println("two arg construcotr called");
//		this.sid = sid;
//		this.sname = sname;
//
//	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Constructor1 c1 = new Constructor1();
		c1.show();
		Constructor1 c2 = new Constructor1(204);
		c2.show();
//		Constructor1 c3 = new Constructor1(205, "divya");

//		c3.show();
		System.out.println("main method ended");

	}

	void show() {
		System.out.println("**********************");
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(sage);
		System.out.println(phone);
		System.out.println("*********************");
	}

}
