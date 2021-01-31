package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab4_1 {

	public static void main(String[] args) {

		List<String[]> transactions = new ArrayList<String[]>();
		String filename = "C:\\Users\\dell\\Files\\CCStatement.csv";
		String dataRow;
		double balance = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while ((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				transactions.add(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(transactions.size());
		System.out.println("DATE | TYPE | TRANSACTION | VENDOR| AMOUNT | BALANCE");
		for (String[] transaction : transactions) {
			String date = transaction[0];
			String type = transaction[1];
			String vendor = transaction[2];
			double amount = Double.parseDouble(transaction[3]);
			System.out.print(date + " | " + type + " | " + vendor + " | $" + amount);

			if (type.equalsIgnoreCase("CREDIT")) {
				// System.out.println("Add to balance");
				balance += amount;
			} else if (type.equalsIgnoreCase("DEBIT")) {
				// System.out.println("Subtract from balance");
				balance -= amount;
			} else {
				// System.out.println("Some other transaction");
			}

			System.out.println(" | " + balance);

		}

		// Check Balance
		if (balance > 0) {
			// charge 10% fee
			System.out.println("You have a balance of  $" + balance);
			System.out.println("You are charged a 10% fee of $" + Math.abs(balance * .10));
			System.out.println("Your new balance is: $" + Math.abs(balance * 1.1));
		} else if (balance < 0) {
			System.out.println("Thank you for the payment");
			System.out.println("You hava a Over Payment  of " + Math.abs(balance));

		} else {
			System.out.println("Thank you for the payment on ontime");
		}

	}

}
