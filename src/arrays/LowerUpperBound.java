package arrays;

public class LowerUpperBound {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 2, 3, 3, 3, 9, 11 };

		// find lower bound of 2
		System.out.println(lowerBound(arr, 2));
		// find upper bound of 3
		System.out.println(upperBound(arr, 3));
	}

	private static int upperBound(int[] arr, int item) {
		int ans = -1;
		
		int low = 0, high = arr.length-1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			if(arr[mid] == item) {
				ans = mid;
				low = mid + 1;
			} else if(arr[mid] > item){
				high = mid - 1;
			} else {
				low = mid + 1;
			}
			
		}
		
		return ans;
	}

	private static int lowerBound(int[] arr, int item) {
		int ans = -1;

		int low = 0, high = arr.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == item) {
				ans = mid;
				high = mid - 1;
			} else if(arr[mid] > item) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return ans;
	}

}
