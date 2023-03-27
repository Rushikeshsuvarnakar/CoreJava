package methodoverloading;

//Different Sequence of arguments
class test1 {
	void show(int a, String b) {
		System.out.println("1");
	}

	void show(String a, int b) {
		System.out.println("2");
	}
}

public class OverLoading2 {

	public static void main(String[] args) {
		test1 t = new test1();
		// t.show(10, "Rushi");
		t.show("Rushi", 14);
	}

}
