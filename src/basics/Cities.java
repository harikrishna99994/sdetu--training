package basics;

public class Cities {

	public static void main(String[] args) {

		// Declare and define an array
		String[] cities = { "New York", "San Fransico", "Miami", "Dallas" };

		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		// System.out.println(cities[4]);

		System.out.println("***************************");
		// Declare and define the array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;

		// do loop: enters the loop then tests the condition
		do {
			System.out.println("STATE: " + states[i]);
			i++;
		} while (i < 5);

		// while loop: tests condition first and enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("STATE FOUND ");
				stateFound = true;
			}
			n++;

		}
		
		// for loop: best structure for iterating through an array
		for (int j = 0; j < states.length; j++) {
			System.out.println(states[j]);
		}

		System.out.println("*************************");
		// Declare array
		String[] countries;

		// Define the array
		countries = new String[3];

		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
	}
}
