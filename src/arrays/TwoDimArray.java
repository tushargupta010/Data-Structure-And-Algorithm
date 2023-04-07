package arrays;

import java.util.Scanner;

/*
 * 
 * 2-D arrays - it is an array of arrays.
 * syntax => datatype[][] reference; => int[][] arr;
 * 
 * System.out.println(arr); // compiler error as array is not initialized.
 * 
*/
public class TwoDimArray {

	private static Scanner scanner;

	static {
		if (scanner == null) {
			scanner = new Scanner(System.in);
		}
	}

	public static void main(String[] args) {
		// declare 2-d array
		int[][] arr;
//		System.out.println(arr);

		// 2-d array initialized and default value is 0
		arr = new int[3][3];
		display2dArray(arr);

		setDefaultValue(arr);
		display2dArray(arr);

		// input from user
		arr = takeInput();
		display2dArray(arr);

		int arr2[][] = { { 1, 5, 9 }, { 7, 5, 3 }, { 4, 5, 6 } };
		display2dArray(arr2);
		
		// compiler error
//		int arr3 = new int[][3];
		
		// here arr4[0] = null, arr4[1] = null, arr4[2] = null
		int[][] arr4 = new int[3][];
		arr4[0] = new int[4];
		arr4[2] = new int[3];
		System.out.println(arr4[0]); // some address
		System.out.println(arr4[1]); // null
		System.out.println(arr4[2]); // some address
//		System.out.println(arr4[3]); // index out of bound exception
		System.out.println(arr4[0][2]); // 0
//		System.out.println(arr4[1][2]); // null pointer exception
		arr4[1] = new int[2];
		display2dArray(arr4);
		
		scanner.close();
	}

	private static int[][] takeInput() {

		System.out.println("Enter number of rows");
		int row = scanner.nextInt();

		System.out.println("Enter number of columns");
		int column = scanner.nextInt();

		int arr[][] = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Enter value for index " + i + "," + j);
				arr[i][j] = scanner.nextInt();
			}
		}

		return arr;
	}

	private static void setDefaultValue(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
			}
		}
	}

	private static void display2dArray(int[][] arr) {
		for (int a[] : arr) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

}
