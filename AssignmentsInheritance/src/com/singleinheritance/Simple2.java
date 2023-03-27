package com.singleinheritance;

class Employe {
	float salary = 40000;
}

class Bonus extends Employe {
	int bonus = 10000;
}

public class Simple2 {

	public static void main(String[] args) {
		Bonus b = new Bonus();
		System.out.println("Employe salary is " + b.salary);
		System.out.println("Bonus of Employe" + b.bonus);

	}

}
