package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {

		// 1. Define the file (path) that we want to read
		String filename = "files\\readFile.txt";
		String text = null;

		// 2.Create the file in java
		File file = new File(filename);

		// 3. open the file

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			// 4.read the file
			text = br.readLine();

			// 5.close the resource
			br.close();

		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the data: " + filename);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file");
		}

		System.out.println(text);

	}

}
