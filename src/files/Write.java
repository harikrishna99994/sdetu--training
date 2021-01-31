package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {

		// 1. Define the file (path) that we want to read
		String filename = "C:\\Users\\dell\\Files\\writeFile.txt";
		String message = " I'm writing data that will be placed to a file";

		// 2. Create the file in java
		File file = new File(filename);

		;
		try {
			// 3. Open the file
			FileWriter fileWriter = new FileWriter(file);

			// 4. Write the file
			fileWriter.write(message);

			// 5. Close the Resource
			fileWriter.close();

		} catch (IOException e) {
			System.out.println("ERROR: Could not read file: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the file writer");
		}

	}
}
