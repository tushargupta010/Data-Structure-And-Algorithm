package recursion;

import java.util.ArrayList;

public class RecursionOps {

	public static void main(String[] args) {

		// factorial of 4 = 4 * factorial of 3 = 4 * 3 * factorial of 2 = ... = 24
		System.out.println(factorial(4));

		System.out.println("===================");
		// 0 1 1 2 3 5 8 13 .... = fibonacci series
		System.out.println(fibonacci(5)); // 5
		System.out.println(fibonacci(7)); // 13

		System.out.println("===================");
		System.out.println(power(2, 5));

		System.out.println("===================");
		int[] arr = { 3, 8, 6, 1, 9, 7 };
		System.out.println(isArraySorted(arr, 0));
		int[] arr2 = { 10, 15, 19, 25, 30, 33 };
		System.out.println(isArraySorted(arr2, 0));
		int[] arr3 = { 10, 85, 79, 25, 60, 70 };
		System.out.println(isArraySorted(arr3, 3));

		System.out.println("===================");
		int firstIndexArray[] = { 6, 8, 1, 1, 8, 3, 4 };
		System.out.println(firstIndex(firstIndexArray, 0, 8)); // 1
		System.out.println(firstIndex(firstIndexArray, 2, 8)); // 4
		System.out.println(firstIndex(firstIndexArray, 0, 5)); // -1

		System.out.println("===================");
		int lastIndexArray[] = { 3, 8, 1, 8, 8, 7 };
		System.out.println(lastIndex(lastIndexArray, 3, 8)); // 4
		System.out.println(lastIndex(lastIndexArray, 0, 8)); // 4
		System.out.println(lastIndex(lastIndexArray, 2, 7)); // 5
		System.out.println(lastIndex(lastIndexArray, 0, 5)); // -1

		System.out.println("===================");
		int allIndexArray[] = { 3, 8, 1, 8, 8, 7 };
		System.out.println(allIndex(allIndexArray, 0, 8)); // [1, 3, 4]
		System.out.println(allIndex(allIndexArray, 2, 8)); // [3, 4]
		System.out.println(allIndex(allIndexArray, 0, 5)); // []

		System.out.println(display(allIndexLatest(allIndexArray, 0, 8, 0))); // [1, 3, 4]

	}

	private static String display(int[] arr) {
		String str = "";
		for (int a : arr) {
			str = str + a + ",";
		}
		return "[" + str.substring(0, str.length()-1) + "]";
	}

	private static int[] allIndexLatest(int[] arr, int startIndex, int data, int count) {

		if (startIndex == arr.length) {
			int[] base = new int[count];
			return base;
		}

		int[] indices = null;
		if (arr[startIndex] == data) {
			indices = allIndexLatest(arr, startIndex + 1, data, count + 1);
		} else {
			indices = allIndexLatest(arr, startIndex + 1, data, count);
		}

		if (arr[startIndex] == data) {
			indices[count] = startIndex;
		}

		return indices;
	}

	private static ArrayList<Integer> allIndex(int[] arr, int startIndex, int data) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (startIndex < arr.length) {
			if (arr[startIndex] == data) {
				list.add(startIndex);
			}
			list.addAll(allIndex(arr, startIndex + 1, data));
		}
		return list;
	}

	private static int lastIndex(int[] arr, int startIndex, int data) {
		int ans = -1;
		if (startIndex == arr.length) {
			return ans;
		}
		ans = lastIndex(arr, startIndex + 1, data);
		if (ans == -1 && arr[startIndex] == data) {
			ans = startIndex;
		}
		return ans;
	}

	private static int firstIndex(int[] arr, int startIndex, int data) {
		if (startIndex == arr.length)
			return -1;
		if (arr[startIndex] == data) {
			return startIndex;
		} else {
			return firstIndex(arr, startIndex + 1, data);
		}
	}

	private static boolean isArraySorted(int[] arr, int startIndex) {

		if (startIndex == arr.length - 1)
			return true;

		return true && arr[startIndex + 1] - arr[startIndex] > 0 && isArraySorted(arr, startIndex + 1);

	}

	private static int power(int a, int b) {
		if (b == 1)
			return a;
		return a * power(a, b - 1);
	}

	private static int fibonacci(int n) {
		if (n == 1 || n == 0)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	private static int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}

}
