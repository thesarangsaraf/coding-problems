package app.amazon;

import java.util.Arrays;

public class KLargestElementsInArray {

	public static int[] run(int[] arr, int k) {
		Arrays.sort(arr);

		int[] results = new int[k];
		for (int i = arr.length - 1, j = 0; i > 0 && k != 0; i--, j++) {
			results[j] = arr[i];
			k--;
		}
		return results;
		
	}

}