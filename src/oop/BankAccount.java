package oop;

public class BankAccount implements IRate {

	String accountNumber;
	// class / static variables
	// static >> belongs to the CLASS not the object instance
	// final >> constant (often static final)
	private static final int routingNumber = 56789;

	// Instance variables
	private String name;
	private String ssn;
	private String accountType;
	private double balance = 0;

	// Constructor definitions: unique methods
	// 1. They are used to define / setup / initialize properties of an object
	// 2. Constructors are IMPLICITLY calle dupon INSTANTIATION
	// 3. The same name as the class name itself
	// 4. Constructors have NO return type

	public BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
		// routingNumber++;
	}

	// Overloading: call same method name with different arguments
	public BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
		this.accountType = accountType;
		// routingNumber++;

	}

	public BankAccount(String accountType, double initialDeposit) {
		// initialDeposit, accountType, Msg are local varaibles
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF $" + initialDeposit);
		String Msg = null;
		if (initialDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be atleasr $1000";
		} else {
			Msg = "Thanks for your initial deposit of $" + initialDeposit;
		}

		System.out.println(Msg);
		balance = balance + initialDeposit;

		// routingNumber++;

	}

	// Getters / Setters

	// Allow the user to define the name
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static int getRoutingnumber() {
		return routingNumber;
	}

	// Define methods
	public void deposit(double amount) {
		balance += amount;
		showActivity("Deposit");
	}

	void withdraw(double amount) {
		balance -= amount;
		showActivity("Withdraw");
	}

	// private method can only be called within class
	private void showActivity(String activity) {
		System.out.println("Account is " + activity);
		System.out.println("Your new Balance is $" + balance);
	}

	void checkBalance() {
		System.out.println("Balance: $" + balance);
	}

	void getStatus() {
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", name=" + name + ", ssn=" + ssn + ", accountType="
				+ accountType + ", balance=" + balance + "]";
	}

	@Override
	public void setRate() {
        System.out.println("SETTING RATE");		
	}

	@Override
	public void increaseRate() {

		System.out.println("INCREASED RATES");
	}

}
