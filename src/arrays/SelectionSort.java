package arrays;

/*
 * The aim of selection sort is put the elements in sorted order (either inc or dec)
 * for this example we do selection sort in inc order
 * 
 * by arranging n-1 elements in sorting order, the nth element will be 
 * automatically at correct index, we can sort the elements
*/
public class SelectionSort {

	public static void main(String[] args) {
		int array[] = {99, 11, 33, 44, 22};
		selectionSort(array);
		display(array);
	}

	private static void display(int[] array) {
		for(int a: array) {
			System.out.println(a);
		}
	}

	private static void selectionSort(int[] array) {
		for(int counter=0; counter < array.length-1; counter++) {
			int min = counter;
			for(int j=counter+1; j <= array.length-1; j++) {
				if(array[j] < array[min]) {
					min = j;
				}
			}
			swap(array, min, counter);
		}
	}

	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
}
