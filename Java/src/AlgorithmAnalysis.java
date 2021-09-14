
public class AlgorithmAnalysis {

	public static <E extends Comparable<E>> void insertionSort(E[] anyList) {

		// Run a for loop and while loop to sort the list using the concept of
		// insertion sort.
		for (int i = 0; i < anyList.length; i++) {

			E temp = anyList[i];

			while (i > 0 && anyList[i - 1].compareTo(temp) > 0) {

				anyList[i] = anyList[i - 1];
				i--;
			}

			anyList[i] = temp;
		}
	}

	public static <E extends Comparable<E>> void bubbleSort(E[] anyList) {

		// Use a double for loop to compare each element in the list with the
		// next element in the list.
		for (int i = 0; i < anyList.length; i++) {

			for (int j = i + 1; j < anyList.length; j++) {

				if (anyList[i].compareTo(anyList[j]) > 0) {

					E temp = anyList[j];
					anyList[j] = anyList[i];
					anyList[i] = temp;
				}
			}
		}
	}

}