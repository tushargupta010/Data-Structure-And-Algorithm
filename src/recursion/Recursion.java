package recursion;

/*
 * Implementation of various Data Structure like tries, trees heavily depend 
 * upon recursion. 
 * Dynamic Programming also depends upon recursion.
 * 
 * Basics :- clear concept of mathematical induction.
 * => my function works before writing my function definition.
 * => when a function calls itself again and again is known as recursion.
*/

public class Recursion {

	public static void main(String[] args) {

		int n = 5;

		// print :- 5 4 3 2 1 when stack is building.
		printDecreasingWhenStackIsBuilding(n);
		System.out.println();

		// print :- 5 4 3 2 1 when stack is falling.
		printIncreasingWhenStackIsFalling(n);
		System.out.println();

		// print :- 5 4 3 2 1 1 2 3 4 5 when stack is building & falling.
		printIncreasingDecreasingWhenStackIsFallingAndBuilding(n);
		System.out.println();

		// print :- 5 3 1 2 4 when stack is building & falling & skipping.
		printIncreasingDecreasingWhenStackIsFallingAndBuildingAndSkipping(n);
		System.out.println();

	}

	private static void printIncreasingDecreasingWhenStackIsFallingAndBuildingAndSkipping(int n) {
		if (n == 0)
			return;
		if (n % 2 == 1)
			System.out.print(n + " ");
		printIncreasingDecreasingWhenStackIsFallingAndBuildingAndSkipping(n - 1);
		if (n % 2 == 0)
			System.out.print(n + " ");
	}

	private static void printIncreasingDecreasingWhenStackIsFallingAndBuilding(int n) {
		if (n == 0)
			return;
		System.out.print(n + " ");
		printIncreasingDecreasingWhenStackIsFallingAndBuilding(n - 1);
		System.out.print(n + " ");
	}

	private static void printIncreasingWhenStackIsFalling(int n) {
		if (n == 0)
			return;
		printIncreasingWhenStackIsFalling(n - 1);
		System.out.print(n + " ");
	}

	private static void printDecreasingWhenStackIsBuilding(int n) {
		if (n == 0)
			return;
		System.out.print(n + " ");
		printDecreasingWhenStackIsBuilding(n - 1);
	}

}
