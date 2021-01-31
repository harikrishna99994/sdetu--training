package datastructures;

public class Arrays {

	public static void main(String[] args) {

		String[] alphabet = { "a", "b", "c", "d", "e", "f" };

		System.out.println("The old fashioned way");

		for (int i = 0; i < 5; i++) {
			System.out.print(alphabet[i] + " ");
		}

		System.out.println("\n\nUsing the length variable");

		int size = alphabet.length;

		for (int i = 0; i < size; i++) {
			System.out.print(alphabet[i] + " ");
		}

		System.out.println("\n\nUsing For-Each method");
		for (String letter : alphabet) {
			System.out.print(letter + " ");
		}
		System.out.println("\n\nDouble Arrays");

		String[][] users = { { "John", "william", "jw@gmail.com", "7856777778" },
				{ "Sarah", "Jackson", "sj@gmail.com", "3345687872" },
				{ "Rachel", "wallace", "rw@gmail.com", "6775534733" } };

		// Get the size of array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);

		// Traverse the double array
		for (int i = 0; i < numOfUsers; i++) {
			for (int j = 0; j < numOfFields; j++) {
				System.out.print(users[i][j] + " ");
			}
			System.out.println("");
		}

		System.out.println("\n\nUsing For-Each");

		for (String[] user : users) {
			System.out.print("[");
			for (String field : user) {
				System.out.print(field + "");
			}
			System.out.println("]");

		}
	}
}
