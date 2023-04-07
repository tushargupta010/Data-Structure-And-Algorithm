package arrays;

public class WavePrint {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 } };

		// output should be 1 2 3 4 14 13 12 11 21 22 23 24 34 33 32 31
		printWave(arr);

	}

	private static void printWave(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean even = i % 2 == 0;
			for (int j = even ? 0 : (arr[i].length - 1); even ? j <= (arr[i].length - 1)
					: j >= 0; j = even ? (j + 1) : (j - 1)) {
				System.out.print(arr[i][j] + " ");
			}
		}
	}

}
