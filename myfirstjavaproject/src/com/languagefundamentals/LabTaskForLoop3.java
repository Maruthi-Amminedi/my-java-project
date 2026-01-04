package com.languagefundamentals;

import java.util.Scanner;

public class LabTaskForLoop3 {

    static void sumofalldigits(int n) {
        int sum = 0;

        for (; n != 0; n = n / 10) {
            int rem = n % 10;
            sum = sum + rem;
        }

        System.out.println("sum of digits: " + sum);
    }

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sumofalldigits(num);
        sc.close();
    }
}
