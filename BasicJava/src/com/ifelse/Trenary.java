package com.ifelse;

import java.util.Scanner;

public class Trenary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter the marks");
		float marks = s.nextFloat();

		System.out.println("Enter the best three marks");
		float BestThree = s.nextFloat();

		System.out.println((marks > 85) || (BestThree > 90) ? "Eligible in collage" : "Not eligible");
	}

}
