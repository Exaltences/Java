
public class Heap {

	public static void main(String[] args) {
		
		int[] list = {0, 3, 4, 1, 19, 6, 7, 15, 14, 13, 10, 2, 11};
		
		buildMaxHeap(list, list.length);
		
		System.out.print("Max Heap is: ");
		
		for (Integer i: list) {
			
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		heapSort(list, list.length);
		
		System.out.print("Sorted list found using heapsort is: ");
		
		for (Integer i: list) {
			
			System.out.print(i + " ");
		}
	}
	
	public static int left(int i) {
		
		return 2 * i;
	}
	
	public static int right(int i) {
		
		return 2 * i + 1;
	}
	
	public static int parent(int i) {
		
		return i / 2;
	}
	
	public static void maxHeapify(int[] A, int i, int n) {
		
		int left = left(i);
		int right = right(i);
		int largest = 0;
		
		if (left < n && A[left] > A[i]) {
			
			largest = left;
		}
		
		else {
			
			largest = i;
		}
		
		if (right < n && A[right] > A[largest]) {
			
			largest = right;
		}
		
		if (largest != i) {
			
			int temp = A[i];
			A[i] = A[largest];
			A[largest] = temp;
			
			maxHeapify(A, largest, n);
		}
	}
	
	public static void buildMaxHeap(int[] A, int n) {
		
		for (int i = n / 2 - 1; i >= 0; i--) {
			
			maxHeapify(A, i, n);
		}
	}
	
	public static void heapSort(int[] A, int n) {
		
		buildMaxHeap(A, n);
		
		for (int i = n - 1; i >= 1; i--) {
			
			int temp = A[0];
			A[0] = A[i - 1];
			A[i - 1] = temp;
			maxHeapify(A, 0, i - 1);
		}
	}
}