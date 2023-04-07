package arrays;

/*
 * The aim of insertion sort is put the elements in sorted order (either inc or dec)
 * for this example we do insertion sort in inc order
 * 
 * by arranging n-1 elements in sorting order, the nth element will be 
 * automatically at correct index, we can sort the elements
*/
public class InsertionSort {

	public static void main(String[] args) {
		int array[] = { 88, 33, 55, 75, 66 };
		insertionSort(array);
		display(array);
	}

	private static void display(int[] array) {
		for (int a : array) {
			System.out.println(a);
		}
	}

	// array till counter index is sorted
	private static void insertionSort(int[] array) {
		for (int counter = 1; counter <= array.length - 1; counter++) {
			int val = array[counter];

			int j = counter - 1;
			while (j >= 0 && array[j] > val) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = val;
		}
	}

}
