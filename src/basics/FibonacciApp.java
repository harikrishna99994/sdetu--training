package basics;

public class FibonacciApp {

	public static void main(String[] args) {
		// Fibonacci number is defined by the sum of the 2 previous fibonacci numbers
		// fib(0) = 0
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 1 + 0 = 1
		// fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5

		int result = fib(10);
		System.out.println(result);

		System.out.println(fact(5));
		//
	}

	private static int fib(int n) {

		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}

		return fib(n - 1) + fib(n - 2);

	}

	private static int fact(int i) {

		if (i == 1 || i == 0) {

			return 1;

		}

		return i * fact(i - 1);

	}

}
