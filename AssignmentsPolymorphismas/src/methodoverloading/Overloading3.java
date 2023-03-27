package methodoverloading;

//Differents arguments Types of arguments
class test3 {
	void show(int a) {
		System.out.println("1");
	}

	void show(String b) {
		System.out.println("2");
	}
}

public class Overloading3 {

	public static void main(String[] args) {
		test3 t = new test3();
		// t.show(10);
		t.show("Rushi");

	}

}