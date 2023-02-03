
//1. Write a Java program print total number of days in a month using switch case 
//input month number 1-->january=31 days
package com.assignmesnts;

import java.util.Scanner;

public class NumberDays {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Ennter the month");
		int month = s.nextInt();

		switch (month) {
		case 1:
			System.out.println("jan=31 Days");
		}
	}

}
