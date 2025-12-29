package com.javaproject;

public class Bmiexample {

	public static void main(String[] args) {
		double weight = 80.5;
		double height = 6.1;
		double Bmivalue = weight / (height * height);
		int Bmi = (int) Bmivalue;
		System.out.println("Bmi value:" + Bmi);

	}

}
