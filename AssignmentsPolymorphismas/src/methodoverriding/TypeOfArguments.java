package methodoverriding;

class Test3 {
	void show(String a) {
		System.out.println("1");
	}
}

class Exam3 extends Test3 {
	void show(String a) {
		System.out.println("2");
	}
}

public class TypeOfArguments {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.show("Rushi");

		Exam3 e = new Exam3();
		e.show("Akash");

	}

}