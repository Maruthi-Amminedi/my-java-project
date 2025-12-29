package com.javaproject;

import java.math.BigInteger;
import java.math.BigDecimal;

public class TypeCasting_2 {
	// normal object data types
	String s1 = "MARUTHI";
	String s2 = new String("Vcube");
	BigInteger BI;
	BigInteger BI1 = new BigInteger("123458512161321513");
	BigInteger BI2 = new BigInteger("12242121545122152454");

	BigDecimal BD;
	// wrapper object data types

	Integer i;
	char ch;
	float f;
	boolean b;

	public static void main(String[] args) {
		System.out.println("main method started");
		TypeCasting_2 t1 = new TypeCasting_2();
		System.out.println("String value =" + t1.s1);
		System.out.println("BigInteger value = " + t1.BI1);
		System.out.println("BigInteger value =" + t1.BI2);
		System.out.println("BigInteger addition =" + t1.BI1.add(t1.BI2));
		System.out.println("Biginteger value =" + t1.BI);
		System.out.println("Bigdecimal value =" + t1.BD);
		System.out.println("charcater value =" + t1.ch);
		System.out.println("floating value=" + t1.f);
		System.out.println("boolean value=" + t1.b);
		System.out.println("Integer value=" + t1.i);
		System.out.println("String value =" + t1.s2);

		System.out.println("main method ended");

	}

}
