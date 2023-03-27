package methodoverloading;

public class TypePromotionifmatchingFound {
	void sum(int a, int b) {
		System.out.println("int arg method invoked");
	}

	void sum(long a, long b) {
		System.out.println("long arg method invoked");
	}

	public static void main(String[] args) {
		TypePromotionifmatchingFound t = new TypePromotionifmatchingFound();
		t.sum(20, 20);
	}

}
