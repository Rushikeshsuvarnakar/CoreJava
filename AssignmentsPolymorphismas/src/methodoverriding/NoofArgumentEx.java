package methodoverriding;

class Test2 {
	void show(int a) {
		System.out.println("first");
	}
}

class Exam extends Test2 {
	void show(int a) {
		System.out.println("second ");
	}
}

public class NoofArgumentEx {

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.show(10);

		Exam e = new Exam();
		e.show(54);

	}

}