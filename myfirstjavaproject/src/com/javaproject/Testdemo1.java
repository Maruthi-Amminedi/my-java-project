package com.javaproject;

public class Testdemo1 {

	public static void main(String[] args) {

		int m = 10, n = 10;
		int res = m++ / (++n * n--) / --m;
		System.out.println(res);
	}

}
