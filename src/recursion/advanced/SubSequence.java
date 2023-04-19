package recursionGet;

import java.util.ArrayList;

public class SubSequence {

	public static void main(String[] args) {

		String str = "abc";
		ArrayList<String> subSequence = getSubSequence(str);
		System.out.println(subSequence);

		subSequence.sort((a, b) -> a.compareTo(b));
		subSequence.sort((a, b) -> a.length() - b.length());
		System.out.println(subSequence);

		System.out.println(subSequence.size());

		str = "ab";
		ArrayList<String> subSequenceWithAscii = getSubSequenceWithAscii(str);
		System.out.println(subSequenceWithAscii);

		subSequenceWithAscii.sort((a, b) -> a.compareTo(b));
		subSequenceWithAscii.sort((a, b) -> a.length() - b.length());
		System.out.println(subSequenceWithAscii);

		System.out.println(subSequenceWithAscii.size());

	}

	private static ArrayList<String> getSubSequence(String str) {

		ArrayList<String> result = new ArrayList<String>();

		if (str.length() == 0) {
			result.add("");
			return result;
		}

		ArrayList<String> subSequence = getSubSequence(str.substring(1));
		result.addAll(subSequence);
		result.addAll(subSequence.stream().map(s -> str.charAt(0) + s).toList());
		return result;
	}

	// TBD
	private static ArrayList<String> getSubSequenceWithAscii(String str) {

		ArrayList<String> result = new ArrayList<String>();

		if (str.length() == 0) {
			result.add("");
			return result;
		}

		char c = str.charAt(0);
		int ascii = c;

		ArrayList<String> subSequence = getSubSequenceWithAscii(str.substring(1));
		result.addAll(subSequence);
		result.addAll(subSequence.stream().map(s -> c + s).toList());
		result.addAll(subSequence.stream().map(s -> ascii + s).toList());
		return result;
	}

}
