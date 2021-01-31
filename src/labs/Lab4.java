package labs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lab4 {

	public static void main(String[] args) {

		List<String[]> data = new ArrayList<String[]>();
		String dataRow;
		String filename = "C:\\Users\\dell\\Files\\CCStatement.csv";
		double balance = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while ((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				data.add(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String[] bill : data) {
			for (int i = 0; i < bill.length; i++) {
				if (bill[i].equalsIgnoreCase("CREDIT")) {
					balance += Double.parseDouble(bill[i + 2]);
					break;
				} else if (bill[i].equalsIgnoreCase("DEBIT")) {
					balance -= Double.parseDouble(bill[i + 2]);
					break;
				}

			}

		}

		int finalAmount = (int) balance;
		System.out.println("Final Amount: " + finalAmount);
		int payment;
		if (finalAmount > 0) {
			// charge 10% fee
			payment = finalAmount + finalAmount / 10;
			System.out.println("Payment Amount: " + payment);
			System.out.println("Reduce Usage of Credit Card");
		} else if (finalAmount == 0) {
			System.out.println("Thank you for the payment on ontime");
		} else {
			System.out.println("Thank you for the payment");
			System.out.println("Over Payment : " + Math.abs(finalAmount));
		}
	}

}
