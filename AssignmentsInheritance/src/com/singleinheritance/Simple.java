package com.singleinheritance;

class Animall {
	String color = "black";
}

class Dogg extends Animall {
	public void leg() {
		System.out.println("four leg");
		System.out.println(color);
	}
}

public class Simple {
	public static void main(String[] args) {
		Dogg d = new Dogg();
		d.leg();

	}
}