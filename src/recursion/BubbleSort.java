package recursion;

public class BubbleSort {

	public static void main(String[] args) {

		// bubble sort using recursion
		int arr[] = { 50, 40, 30, 20, 10 };
		bubbleSort(arr, 0, arr.length - 1);
		display(arr);

		int arr2[] = { 50, 60, 45, 65, 55 };
		bubbleSort(arr2, 0, arr.length - 1);
		display(arr2);
		
	}

	private static void display(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	private static void bubbleSort(int[] arr, int start, int end) {
		if (start == end) {
			return;
		}
		if (arr[start] > arr[start + 1]) {
			int temp = arr[start];
			arr[start] = arr[start + 1];
			arr[start + 1] = temp;
		}
		if (start + 1 == end) {
			bubbleSort(arr, 0, end - 1);
			return;
		}
		bubbleSort(arr, start + 1, end);
	}

}
