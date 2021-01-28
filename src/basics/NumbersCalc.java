package basics;

public class NumbersCalc {

	public static void main(String[] args) {

		System.out.println("program is starting");

		printName();

		int num1 = 10;
		int num2 = 20;

		addNumbers(num1, num2);

		int product = multipleNumbers(num1, num2);
		System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
	}

	private static void printName() {
		System.out.println(" My Name is Hari Krishna");
	}

	private static void addNumbers(int numberA, int numberB) {
		int sum = numberA + numberB;
		System.out.println("The sum of " + numberA + " and " + numberB + " is " + sum);
	}

	private static int multipleNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		addNumbers(product + 1, product);
		return product;
	}

}
