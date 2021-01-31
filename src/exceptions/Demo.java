package exceptions;

public class Demo {

	public static void main(String[] args) {

		int a = 5;
		int b = 0;

		System.out.println("program starts");
		doMath(a, b);
		System.out.println("program continues");
	}

	public static void doMath(int a, int b) {
		answer(a, b);
	}

	public static double answer(int x, int y) {
		// catch error here
		return x / y;
	}
}
