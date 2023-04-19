package recursion.advanced;

import java.util.ArrayList;

public class BoardPath {

	public static void main(String[] args) {

		// roll a dice to sum n
		System.out.println(getBoardPath(0, 10)); // ["22222", "3331", "442", "55", ......]
		// size for 10 is 492

		System.out.println();
		printBoardPath(0, 10, "");

	}

	private static void printBoardPath(int curr, int end, String result) {
		if (curr == end) {
			System.out.print(result + ", ");
		}
		if (curr > end) {
			return;
		}
		for (int i = 1; i <= 6; i++) {
			printBoardPath(curr + i, end, result + i);
		}
	}

	private static ArrayList<String> getBoardPath(int curr, int end) {

		ArrayList<String> result = new ArrayList<String>();

		if (curr > end) {
			return result;
		}

		if (curr == end) {
			result.add("");
			return result;
		}

		for (int dice = 1; dice <= 6; dice++) {
			int d = dice;
			ArrayList<String> boardPath = getBoardPath(curr + d, end);
			result.addAll(boardPath.stream().map(b -> d + b).toList());
		}

		return result;
	}

}
