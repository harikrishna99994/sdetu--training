package algorithms;

public class Sort {

	public static void bubbleSort(int[] dataSet) {

		System.out.println("Original Array:\n");
		print(dataSet);
		boolean swapped;

		do {
			swapped = false;
			for (int i = 0; i < dataSet.length - 1; i++) {

				if (dataSet[i] > dataSet[i + 1]) {
					int temp = dataSet[i];
					dataSet[i] = dataSet[i + 1];
					dataSet[i + 1] = temp;
					System.out.print("Swap ");
					print(dataSet);
					swapped = true;
				}

			}
		} while (swapped);
	}

	public static void print(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}
}
