package com.hierarchical;

class Animal4 {
	void eat() {
		System.out.println("Eating..");
	}
}

class Dog4 extends Animal4 {
	void bark() {
		System.out.println("Barking ..");
	}
}

class cat4 extends Animal4 {
	void meow() {
		System.out.println("meowing ..");
	}
}

public class Hierachical {

	public static void main(String[] args) {
		cat4 c = new cat4();
		c.meow();
		c.eat();

	}

}
