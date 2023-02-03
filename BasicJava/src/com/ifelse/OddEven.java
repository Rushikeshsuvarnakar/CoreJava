package com.ifelse;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// int even, odd;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number = sc.nextInt();
		// odd = sc.nextInt();
		// even = sc.nextInt();
		if (number % 2 == 0) {
			System.out.println("Even number ");
		} else {
			System.out.println("odd number");
		}

	}

}
