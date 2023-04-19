package recursion.advanced;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {

		System.out.println(getPermutation("a"));
		System.out.println(getPermutation("ab"));
		System.out.println(getPermutation("abc"));
		System.out.println(getPermutation("abcd"));

		System.out.println("Print Permutation =====>");
		System.out.println();
		printPermutation("a", "");
		System.out.println();
		printPermutation("ab", "");
		System.out.println();
		printPermutation("abc", "");
		System.out.println();
		printPermutation("abcd", "");

	}

	private static void printPermutation(String str, String result) {

		if (str.length() == 0) {
			System.out.print(result + ", ");
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			printPermutation(str.substring(0, i) + str.substring(i + 1), result + str.charAt(i));
		}

	}

	private static ArrayList<String> getPermutation(String str) {

		ArrayList<String> result = new ArrayList<String>();

		if (str.length() == 1) {
			result.add(str);
			return result;
		}

		for (String s : getPermutation(str.substring(1))) {
			for (int i = 0; i <= s.length(); i++) {
				result.add(s.substring(0, i) + str.charAt(0) + s.substring(i));
			}
		}

		return result;
	}

}
