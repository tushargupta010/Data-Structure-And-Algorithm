package arrays;

public class SpiralPrint {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 } };

		// output should be 1 2 3 4 14 24 34 33 32 31 21 11 12 13 23 22
		printSpiralClockWiseBasic(arr);
		System.out.println();
		printSpiralClockWiseLogically(arr);

	}

	private static void printSpiralClockWiseLogically(int[][] arr) {
		int top, bottom, left, right, dir;
		top = 0;
		bottom = arr.length - 1;
		left = 0;
		right = arr[top].length - 1;
		dir = 1;

		while (left <= right && top <= bottom) {
			if (dir == 1) {
				for (int i = left; i <= right; i++) {
					System.out.print(arr[top][i] + " ");
				}
				top++;
				dir = 2;
			}
			if (dir == 2) {
				for (int i = top; i <= bottom; i++) {
					System.out.print(arr[i][right] + " ");
				}
				right--;
				dir = 3;
			}
			if (dir == 3) {
				for (int i = right; i >= left; i--) {
					System.out.print(arr[bottom][i] + " ");
				}
				bottom--;
				dir = 4;
			}
			if (dir == 4) {
				for (int i = bottom; i >= top; i--) {
					System.out.print(arr[i][left] + " ");
				}
				left++;
				dir = 1;
			}
		}

	}

	private static void printSpiralClockWiseBasic(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			n = n - i;
			for (int j = i; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			for (int j = i + 1; j < n; j++) {
				System.out.print(arr[j][n - 1] + " ");
			}
			for (int j = n - 2; j >= i; j--) {
				System.out.print(arr[n - 1][j] + " ");
			}
			for (int j = n - 2; j >= i + 1; j--) {
				System.out.print(arr[j][i] + " ");
			}
		}
	}

}
