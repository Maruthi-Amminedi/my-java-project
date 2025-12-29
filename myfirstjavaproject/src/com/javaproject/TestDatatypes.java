package com.javaproject;

public class TestDatatypes {
	byte b;
	byte b1 = (byte) 129;
	short s;
	int i;
	long l;

	float f;
	double d;

	char c;
	boolean boo;

	public static void main(String[] args) {
		System.out.println("main method started");
		TestDatatypes t1 = new TestDatatypes();
		System.out.println("byte=" + t1.b);
		System.out.println("byte velue="+t1.b1);
		System.out.println("short=" + t1.s);
		System.out.println("int =" + t1.i);
		System.out.println("long =" + t1.l);
		System.out.println("float=" + t1.f);
		System.out.println("double=" + t1.d);
		System.out.println("char = " + t1.c);
		System.out.println("boolean=" + t1.boo);
		System.out.println("main method ended");

	}

}
