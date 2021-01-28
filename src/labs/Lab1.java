package labs;

public class Lab1 {

	public static void main(String[] args) {
		// write a function that takes a value N and returns the sum of 1 to N

		System.out.println(sum(5));

		// write a function that computes factorial *hint: use recursion n! = n*(n-1)! 
       System.out.println("Factorial : "+fact(5));
       
       //Write 3 functions that take an array as a parameter and return the minimum,
      // average, and maximum values of that array.
       int[] numbers = { 1, 2, 3, 4, 5 };

		System.out.println("Min : "+ findMin(numbers));
		
		System.out.println("Max : "+ findMax(numbers));
    
		System.out.println("Avg : "+ findAvg(numbers));


	}

	public static int sum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		return sum;
	}

	private static int fact(int i) {

		if (i == 0) {

			return 1;
		}

		return i * fact(i - 1);

	}
	
	private static int findMin(int[] numbers) {

		int minValue = Integer.MAX_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < minValue) {
				minValue = numbers[i];
			}
		}

		return minValue;
	}
	
	private static int findMax(int[] numbers) {

		int maxValue = Integer.MIN_VALUE;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}

		return maxValue;
	}
   
	private static int findAvg(int[] numbers) {
        
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum/numbers.length;
	}


}
