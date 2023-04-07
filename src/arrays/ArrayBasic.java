package arrays;

public class ArrayBasic {

	public static void main(String[] args) {

		demoArray();

		int[] arr = { 10, 20, 30, 40, 50 };
		int i = 0, j = 2;

		// non-working swap
		System.out.println("non-working swap");
		System.out.println(arr[i] + ", " + arr[j]);
		swap(arr[i], arr[j]);
		System.out.println(arr[i] + ", " + arr[j]);

		// working swap
		System.out.println("working swap");
		System.out.println(arr[i] + ", " + arr[j]);
		swap(arr, i, j);
		System.out.println(arr[i] + ", " + arr[j]);

		// non-working swap
		int[] other = { 100, 200, 300 };
		System.out.println(arr[0] + ", " + other[0]);
		swap(arr, other);
		System.out.println(arr[0] + ", " + other[0]);

	}

	private static void swap(int[] arr, int[] other) {
		int[] temp = arr;
		arr = other;
		other = temp;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}

	private static void demoArray() {
		// declare
		int[] arr = null;
		System.out.println(arr);

		// allocate space
		arr = new int[5];
		System.out.println(arr);

		// enhanced for-loop (disadvantage :- forward only)
		for (int i : arr) {
			System.out.println(i);
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 * (i + 1);
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}

}
