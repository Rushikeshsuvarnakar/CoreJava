package methodoverriding;

class Test1 {
	void show() {
		System.out.println("1");
	}
}

class Xyz extends Test1 {
	void show() {
		System.out.println("2");
	}
}

public class NOofArgument {

	public static void main(String[] args) {

		Test1 t = new Test1();
		t.show();
		Xyz x = new Xyz();
		x.show();
	}

}