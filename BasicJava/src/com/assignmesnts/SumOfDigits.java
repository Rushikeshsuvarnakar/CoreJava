package com.assignmesnts;

import java.util.Scanner;

public class SumOfDigits {

	public static void sumDigits(int num) {
		int sum = 0;

		while (num != 0) {
			int r = num % 10;
			sum = sum + r;

			// System.out.println(num%10);
			num = num / 10;

		}
		System.out.println("The sum is :" + sum);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sumDigits(n);

	}

}
