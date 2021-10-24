package algorithmprograms;

import java.util.Arrays;

public class BinarySearchImplementation {

	public static void main(String[] args) {
		String[] arr = { "Lion", "Tiger", "Elephant", "Zebra", "Giraffe" };
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		String a = "Tiger";
		int result = binarySearch(arr, a);

		if (result == -1) {
			System.out.println("NOT FOUND");
		} else {
			System.out.println("FOUND");
		}
	}

	static int binarySearch(String[] arr, String a) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			int ans = a.compareTo(arr[mid]);
			if (ans == 0)
				return mid;
			if (ans > 0)
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;

	}

}