package recursionGet;

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
