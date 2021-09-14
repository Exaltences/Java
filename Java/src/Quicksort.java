
import java.util.Random;

public class Quicksort {

	public static void main(String[] args) {
		
		int[] array = {5, 3, 6, 1, 8, 2, 9, 7, 10, 4};
		
		randomizedQuicksort(array, 0, array.length - 1);
		
		System.out.println("Sorted list is: ");
		
		for (Integer i: array) {
			
			System.out.print(i + " ");
		}
	}
	
	public static int partition(int[] A, int p, int r) {
		
		int x = A[r];
		int i = p - 1;
		
		for (int j = p; j < r; j++) {
			
			if (A[j] <= x) {
				
				i += 1;
				
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		
		int temp = A[i + 1];
		A[i + 1] = A[r];
		A[r] = temp;
		
		return i + 1;
	}

	public static int randomizedPartition(int[] A, int p, int r) {
		
		
		int i = (int)(Math.random() * r) + p; 
		int temp = A[i];
		A[i] = A[r];
		A[r] = temp;
		
		int x = partition(A, p, r);
		
		return x;
	}
	
	public static void randomizedQuicksort(int[] A, int p, int r) {
		
		if (p < r) {
			
			int q = randomizedPartition(A, p, r);
			randomizedQuicksort(A, p, q - 1);
			randomizedQuicksort(A, q + 1, r);
		}
	}
}