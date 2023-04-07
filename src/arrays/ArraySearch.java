package arrays;

public class ArraySearch {

	public static void main(String[] args) {
		int[] arr = { 20, 30, 50, 35, 40 };
		int item = 35;

		System.out.println("Max possible comparison is n. i.e, " + arr.length);
		int index = linearSearch(arr, item);
		System.out.println(index);

		int[] other = { 5, 7, 10, 12, 15, 20, 27, 31, 36, 42, 55, 58, 60, 65, 70, 80 };
		item = 55;
		index = binarySearch(other, item);
		System.out.println(index);

	}

	// for binary search elements of array are in sorted order (ascending)
	// binary search is better than linear search because time complexity is 
	// order of (log n base 2) in case of binary search.
	private static int binarySearch(int[] array, int item) {
		int low = 0;
		int high = array.length;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (array[mid] < item) {
				low = mid + 1;
			} else if (array[mid] > item) {
				high = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}

	private static int linearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}

}
