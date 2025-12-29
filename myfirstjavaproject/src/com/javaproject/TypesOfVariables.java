package com.javaproject;

public class TypesOfVariables {
	int a = 10;
	String name = "maruthi";

	static int b = 20;
	static String name1 = "Amminedi";

	public static void main(String[] args) {
		var c = 30;
		var name2= "naidu";
		TypesOfVariables t1 = new TypesOfVariables();
		System.out.println("main method started");
		System.out.println(b);
		System.out.println(name1);
		System.out.println(t1.a);
		System.out.println(t1.name);
		System.out.println("main method ended");
		System.out.println(TypesOfVariables.b);
		System.out.println(TypesOfVariables.name1);
		System.out.println(c);
		System.out.println(name2);

	}

}
