package recursion.advanced;

import java.util.ArrayList;

public class MazePath {

	public static void main(String[] args) {

		// Grid of 3 by 3 is given
		// get all possible ways to path 0,0 to 2,2
		// note: either take 1 horizontal or 1 vertical steps

		// for 3 by 3 = 6 ways

		System.out.println(getMazePath(3, 0, 0));

		// diagonal move also
		System.out.println(getMazePathDiag(3, 0, 0));

		System.out.println();
		System.out.println("Print MazePath =>");
		printMazePath(0, 0, 2, 2, "");

		System.out.println();
		System.out.println("Print MazePath With Diaglonal =>");
		printMazePathWithDiag(0, 0, 2, 2, "");

	}

	private static void printMazePathWithDiag(int x, int y, int a, int b, String result) {

		if (x > a || y > b) {
			return;
		}

		if (x == a && y == b) {
			System.out.print(result + ", ");
		}

		printMazePathWithDiag(x + 1, y, a, b, result + "H");
		printMazePathWithDiag(x, y + 1, a, b, result + "V");
		printMazePathWithDiag(x + 1, y + 1, a, b, result + "D");

	}

	private static void printMazePath(int x, int y, int a, int b, String result) {

		if (x > a || y > b) {
			return;
		}

		if (x == a && y == b) {
			System.out.print(result + ", ");
		}

		printMazePath(x + 1, y, a, b, result + "H");
		printMazePath(x, y + 1, a, b, result + "V");

	}

	private static ArrayList<String> getMazePath(int size, int x, int y) {
		ArrayList<String> result = new ArrayList<String>();

		if (x == size - 1 && y == size - 1) {
			result.add("");
			return result;
		}

		if (x > size - 1 || y > size - 1) {
			return result;
		}

		result.addAll(getMazePath(size, x + 1, y).stream().map(b -> "H" + b).toList());
		result.addAll(getMazePath(size, x, y + 1).stream().map(b -> "V" + b).toList());

		return result;
	}

	private static ArrayList<String> getMazePathDiag(int size, int x, int y) {
		ArrayList<String> result = new ArrayList<String>();

		if (x == size - 1 && y == size - 1) {
			result.add("");
			return result;
		}

		if (x > size - 1 || y > size - 1) {
			return result;
		}

		result.addAll(getMazePathDiag(size, x + 1, y).stream().map(b -> "H" + b).toList());
		result.addAll(getMazePathDiag(size, x, y + 1).stream().map(b -> "V" + b).toList());
		result.addAll(getMazePathDiag(size, x + 1, y + 1).stream().map(b -> "D" + b).toList());

		return result;
	}
}
