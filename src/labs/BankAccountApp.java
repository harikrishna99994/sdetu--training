package labs;

public class BankAccountApp {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount("465536377", 1000);
		BankAccount account2 = new BankAccount("565536377", 2000);
		BankAccount account3 = new BankAccount("47S5536377", 3000);

		account1.setName("Jim");
		System.out.println(account1.getName());
		account1.makeDeposit(500);
		account1.makeDeposit(600);
		account1.payBill(1000);
		account1.accrue();
		System.out.println(account1.toString());
	}

}

class BankAccount implements IInterest {
	// properties of bank account
	private static int iD = 1000; // Internal ID
	private String accountNumber; // iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;

	// Constructor
	public BankAccount(String SSN, double initialDeposit) {
		this.SSN = SSN;
		this.balance = initialDeposit;
		iD++;
		setAccountNumber();
	}

	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number : " + accountNumber);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying  Bill: " + amount);
		showBalance();
	}

	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making Deposit: " + amount);
		showBalance();
	}

	public void showBalance() {
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate / 100);
		showBalance();
	}

	@Override
	public String toString() {

		return "[Name: " + name + "]\n[Account Number: " + accountNumber + "]\n[Routing Number: " + routingNumber + "]\n[Balance: "+balance+"]";
	}

}
