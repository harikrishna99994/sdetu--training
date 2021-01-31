package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lab3 {

	public static void main(String[] args) {

		String filename = "files\\Password.txt";

		File file = new File(filename);
		String[] passwords = new String[13];
		// String password = null;

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i = 0; i < passwords.length; i++) {
				passwords[i] = br.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File Not Found");
		} catch (IOException e) {
			System.out.println("ERROR: Could not Read file");
		}

		// System.out.println(passwords[0]);

		for (String password : passwords) {
			System.out.println("*******\n" + password);
			boolean hasNumber = false;
			boolean hasLetter = false;
			boolean hasSpecialChar = false;
			for (int j = 0; j < password.length(); j++) {
				if ("1234567890".contains(password.substring(j, j + 1))) {
					hasNumber = true;
				} else if ("abcdefghijklmnopqrstuvwxyz".contains(password.substring(j, j + 1).toLowerCase())) {
					hasLetter = true;
				} else if ("~!@#$%^&*(){}:;><+_-,.?/|".contains(password.substring(j, j + 1))) {
					hasSpecialChar = true;
				}
			}

			try {
				if (!hasNumber) {
					throw new NumberCriteriaException(password);
				} else if (!hasLetter) {
					throw new LetterCriteriaException(password);
				} else if (!hasSpecialChar) {
					throw new SpecialCharacterCriteriaException(password);
				} else {
					System.out.println("Valid Password");
				}
			} catch (NumberCriteriaException | LetterCriteriaException | SpecialCharacterCriteriaException e) {
				System.out.println("Invalid Password");
				System.out.println(e);
			}
		}

	}
}

class NumberCriteriaException extends Exception {

	String password;

	public NumberCriteriaException(String password) {
		this.password = password;
	}

	public String toString() {

		return "NumberCriteriaException " + password;

	}
}

class LetterCriteriaException extends Exception {
	String password;

	public LetterCriteriaException(String password) {
		this.password = password;
	}

	public String toString() {

		return "LetterCriteriaException " + password;

	}

}

class SpecialCharacterCriteriaException extends Exception {
	String password;

	public SpecialCharacterCriteriaException(String password) {
		this.password = password;
	}

	public String toString() {

		return "SpecialCharacterCriteriaException " + password;

	}

}
