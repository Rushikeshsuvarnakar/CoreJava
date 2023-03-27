package methodoverriding;

class Test4 {
	void show(String a, int b) {
		System.out.println("1");
	}
}

class Xobin extends Test4 {
	void show(String a, int b) {
		System.out.println("2");
	}
}

public class SequenceofArgumnets {

	public static void main(String[] args) {

		Test4 t = new Test4();
		t.show("Rushi", 10);

		Xobin x = new Xobin();
		x.show("Mukatai", 89);
	}

}