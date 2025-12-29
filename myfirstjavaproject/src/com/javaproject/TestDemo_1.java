package com.javaproject;

public class TestDemo_1 {
	public static void main(String[] args) {

		byte b = 15;
		short s = 252;
		int i = 456784;
		long l = 45785478;
		char ch = 'm';

		Byte num = 112;
		int add = (b + num);
		System.out.println(add);

		Short s1 = 1425;
		int add1 = (s * s1);
		System.out.println(add1);

		Integer i1 = 412457;
		int add2 = (i + i1);
		System.out.println(add2);

		Long l1 = 15468445L;
		int add3 = (int) (l + l1);
		System.out.println(add3);
		
		Character ch1 = 'f';
		char add4 = (char) (ch + ch1);
		System.out.println(add4);

	}

}
