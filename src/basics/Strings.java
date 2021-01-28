package basics;

public class Strings {

	public static void main(String[] args) {

		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";

		if (bookTitle.contains(wordChoice)) {

			System.out.println("The book contains the word " + wordChoice);
		}

		String browser = "chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is " + browser);
		}

		String firstName = "Hari";
		String lastName = "Krishna";
		String SSN = "9876543210";
		
		System.out.println("There are "+SSN.length()+ " digits in your SSN.");
		
		// Print the initials plus last 4 digits of SSN
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.subSequence(0,1));
		System.out.print(SSN.substring(SSN.length()-4));
	}

}
