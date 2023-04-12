package recursion;

public class RecursionPattern {

	public static void main(String[] args) {

		/*
		 * when n = 5, print pattern using recursion
		 * 
		 * @
		 * 
		 * @ @
		 * 
		 * @ @ @
		 * 
		 * @ @ @ @
		 * 
		 * @ @ @ @ @
		 * 
		 */
		printPattern(5, 1, 1);

	}

	private static void printPattern(int n, int row, int col) {

		if (row > n) {
			return;
		}

		if (col <= row) {
			System.out.print("@ ");
			printPattern(n, row, col + 1);
		} else {
			System.out.println();
			printPattern(n, row + 1, 1);
		}

	}

}
