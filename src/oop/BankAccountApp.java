package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// create a new Bank account >> think instantiate an object

		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "0123456";
		// acc1.name = "Rajesh";
		// acc1.accountType = "Savings Account";
		// With Encapsulation
		acc1.setName("Rajesh");
		acc1.setAccountType("Savings Account");

		// polymorphism through overriding
		System.out.println(acc1.toString());
		System.out.println(BankAccount.getRoutingnumber());
		// acc1.showActivity();//private method (showActivity())
		acc1.deposit(1000);

		/*
		 * // polymorphism through overloading BankAccount acc2 = new
		 * BankAccount("Checking Account"); acc2.accountNumber = "0123456";
		 * //System.out.println(acc2.routingNumber);
		 * 
		 * BankAccount acc3 = new BankAccount("Checking Account", 100);
		 * acc3.accountNumber = "0123456"; acc3.checkBalance();
		 * 
		 * //System.out.println(acc3.routingNumber);
		 * 
		 * // Demo for inheritance CDAccount cd1 = new CDAccount(); cd1.balance = 3000;
		 * cd1.name = "Pranay"; cd1.accountType ="CD Account";
		 * System.out.println(cd1.toString()); cd1.compound();
		 */
	}
}
