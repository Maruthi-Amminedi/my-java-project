package com.corejavapackage;

public class Employe {
	int eid;
	String ename;
	double esalary;
	int eage;

	Employe() {
		System.out.println("no arg constructor called");
		eid = 253;
		ename = "maruthi";
		esalary = 646110.562;
		eage = 23;
	}

	Employe(int eid, String ename) {
		System.out.println("two arg constructor called");
		this.eid = eid;
		this.ename = ename;

	}

	Employe(int eid, String ename, double esalry, int eage) {
		System.out.println("4 arg constructor called");
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalry;
		this.eage = eage;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Employe e1 = new Employe();
		Employe e2 = new Employe(225, "virat");
		Employe e3 = new Employe(215, "suzuki", 444540.4, 14);
		e1.show();
		e2.show();
		e3.show();
		System.out.println("main method ended");

	}

	void show() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esalary);
		System.out.println(eage);
		System.out.println("**************************************");
	}

}
