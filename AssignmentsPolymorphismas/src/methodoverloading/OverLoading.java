package methodoverloading;

//Different no of arguments
class test {
	// void show()
	void show(int a, int b) {
		System.out.println("1");
	}

	void show(int a) {
		System.out.println("2");
	}
}

public class OverLoading {

	public static void main(String[] args) {
		test t = new test();
		// t.show(10);
		t.show(10, 20);
	}

}
