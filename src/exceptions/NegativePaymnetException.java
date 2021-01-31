package exceptions;

public class NegativePaymnetException extends Exception {

	// Define class variable
	double payment;

	// 1.constructor that takes the value that would throw the exception
	// 2. Assign value of local variable to class varaible
	public NegativePaymnetException(double paymnet) {
		// System.out.println("ERROR: Negative Payment");
		this.payment = paymnet;
	}

	// 3. Override the toString() method to include the specific exception message
	@Override
	public String toString() {
		return "Error cannot take negative payments " + payment;
	}

}
