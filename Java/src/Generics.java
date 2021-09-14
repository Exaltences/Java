
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics {

	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {

		for (int i = 0; i < list.length; i++) {

			if (key.equals(list[i])) {

				return i;
			}
		}

		return -1;
	}

	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {

		// Sort the array
		Arrays.sort(list);

		// Declare the lowest number to be 0, the lowest number in the array and
		// highest number to be list.length - 1, the highest number in the
		// array.
		int lowestNumber = 0;
		int highestNumber = list.length - 1;

		// Run a while loop that stops only when the number is found or when the
		// lowest number is greater than the highest number.
		while (lowestNumber <= highestNumber) {

			// middleNum will always be the average of the lowest and highest
			// numbers.
			int middleNumber = (lowestNumber + highestNumber) / 2;
			E middleValue = list[middleNumber];

			// If the key is greater than the middle number, change the low
			// value to be above the current mid value.
			if (key.compareTo(middleValue) < 0) {

				highestNumber = middleNumber - 1;
			}

			// If the key is equal to the middle number, return the middle
			// number.
			else if (key.compareTo(middleValue) == 0) {

				return middleNumber;
			}

			// If the key is less than the middle number, change the high value
			// to
			// be below the current mid value.
			else if (key.compareTo(middleValue) > 0) {

				lowestNumber = middleNumber + 1;

			}
		}

		return -1;

	}

	public static <E extends Comparable<E>> void selectionSort(E[] list) {

		// Run a double for loop to replace each element in the list.
		for (int i = 0; i <= list.length - 2; i++) {

			for (int j = i + 1; j <= list.length - 1; j++) {

				// If an element is less than i, use temp swap to swap the two
				// values.
				if (list[j].compareTo(list[i]) < 0) {

					E temp = list[j];
					list[j] = list[i];
					list[i] = temp;
				}
			}
		}
	}

	public static <E> List<E> removeDuplicates(E[] list) {

		// I used an ArrayList instead of an array because when I attempted to
		// cast a generic array into a new object, I kept getting a
		// ClassCastException, even when I commented everything out except for
		// the line that creates a generic array using the method that you
		// implemented in class.

		// Create a new list.
		List<E> newList = new ArrayList<E>();

		// Transfer elements from the list to the new list.
		for (int i = 0; i < list.length; i++) {

			if (!newList.contains(list[i])) {

				newList.add(list[i]);
			}
		}

		return newList;
	}

	public static <E extends Comparable<E>> E max(E[][] list) {

		// Set the max to the first element in the list.
		E max = list[0][0];

		// Run a double for loop that replaces the max each time a number in the
		// list
		// is greater than the max.
		for (int i = 0; i < list.length; i++) {

			for (int j = 0; j < list[i].length; j++) {

				if (list[i][j].compareTo(max) > 0) {

					max = list[i][j];
				}
			}
		}

		return max;
	}
}