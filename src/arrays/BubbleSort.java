package arrays;

/*
 * The aim of bubble sort is put the elements in sorted order (either inc or dec)
 * for this example we do bubble sort in inc order
 * 
 * by arranging n-1 elements in sorting order, the nth element will be 
 * automatically at correct index, we can sort the elements
*/
public class BubbleSort {

	public static void main(String[] args) {
		int array[] = {88, 66, 55, 44, 22};
		bubbleSort(array);
		display(array);
	}

	private static void display(int[] array) {
		for(int a: array) {
			System.out.println(a);
		}
	}

	private static void bubbleSort(int[] array) {
		for(int counter=0; counter < array.length-1; counter++) {
			for(int j=0; j < array.length-1-counter; j++) {
				if(array[j] > array[j+1]) {
					swap(array, j, j+1);
				}
			}
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
}
