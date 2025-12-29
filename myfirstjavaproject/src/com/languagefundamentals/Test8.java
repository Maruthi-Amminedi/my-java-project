package com.languagefundamentals;
import java.util.Scanner;
//WAP TO CALCULATE NUMBERS FROM CONSOLE

public class Test8 {

	public static void main(String[] args) {
		System.out.println("Caluclator Program Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A value:");
		int a = sc.nextInt();
		System.out.println("Enter B value:");
		int b = sc.nextInt();
		System.out.println("Enter a symbol like this: +, -, *, /, %");
		String symbol = sc.next();
		switch(symbol) {
		case "+" -> System.out.println(a+b);
		case "-" -> System.out.println(a-b);
		case "*" -> System.out.println(a*b);
		case "/" -> System.out.println(a/b);
		case "%" -> System.out.println(a%b);
		default -> System.out.println("Enter invalid symbol");
		}
		sc.close();
	}

}
