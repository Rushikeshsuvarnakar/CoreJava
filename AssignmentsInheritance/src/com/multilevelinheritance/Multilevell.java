package com.multilevelinheritance;

class Animal3 {
	void eat() {
		System.out.println("Eating,,,,");
	}
}

class Dog1 extends Animal3 {
	void barking() {
		System.out.println("Barking");
	}
}

class babyDog extends Dog1 {
	void weep() {
		System.out.println("weeping");
	}
}

public class Multilevell {

	public static void main(String[] args) {
		babyDog bd = new babyDog();
		bd.weep();
		bd.barking();
		bd.eat();

	}

}
