package exceptions;

import java.util.Scanner;

public class PaymentsApp {

	// Take a payment from the user
	public static void main(String[] args) {

		double payment = 0;
		boolean positivePymt = true;

		

		do {
			// 1. Ask the user for input
			System.out.print("Enter the Payment Amount: ");
			
			// 2. get the amount and test the value
			Scanner in = new Scanner(System.in);

			// 3. Handle exceptions appropriately
			try {
				payment = in.nextDouble();
				if (payment < 0) {
					// throw error
					throw new NegativePaymnetException(payment);
				}else {
					positivePymt = true;
				}
			} catch (NegativePaymnetException e) { // exception
				System.out.println(e.toString());
				positivePymt = false;
				System.out.println("Retry Payment");
			}
		} while (!positivePymt);

		// 4. Print confirmation
		System.out.println("Thank you for the payment of $"+payment);
	}
}
