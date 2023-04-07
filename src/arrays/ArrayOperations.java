package arrays;

import java.util.Scanner;

public class ArrayOperations {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] array = takeInput();

		display(array);

		int max = maxInArray(array);
		System.out.println("Maximum in array: " + max);
	}

	private static int maxInArray(int[] array) {
		int max = Integer.MIN_VALUE;
		for (int i : array) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}

	private static void display(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}

	private static int[] takeInput() {

		System.out.println("Size of array?");
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the value for " + i + " index?");
			arr[i] = scanner.nextInt();
		}

		return arr;
	}

}
