package com.logic;

import java.util.Scanner;

public class FrequencyDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int n, count;
		System.out.println("Frequency of Digit" + num);

		for (int i = 0; i < 10; i++) {
			n = num;
			count = 0;
			while (n != 0) {
				if (i == (n % 10)) {
					count++;
					n = n / 10;

				}
				if (count > 0) {
					System.out.print(i + "count");
				}
			}
		}
	}

}
