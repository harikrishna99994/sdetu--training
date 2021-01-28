package basics;

public class SalaryCalculator {

	public static void main(String[] args) {

		// let's create a variable to define our career

		// Declare a variable
		String career;
		System.out.println("Program is Starting");
		career = "Software Developer";
		System.out.println("My Career: " + career);

		// Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";

		// compute our annual salary
		double salary = hoursPerWeek * weeksPerYear * rate;

		System.out.println(
				"My salary as a " + career + " at the rate of $" + rate + " per hour $" + salary + " per year");
	}
}
