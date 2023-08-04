package app.amazon;

import java.util.Arrays;

public class PythagorianTripletInArray {

	// find a^2 + b^2 = c^2
	public static boolean run(int[] arr) {

		// create square of every element in array first
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		}

		// sort entire array
		Arrays.sort(arr);
		System.out.println("Sorted array - " + Arrays.toString(arr));

		// extract last index of array - considerably highest number in array
		for (int i = arr.length - 1; i >= 2; i--) {
			int sum = arr[i];
			System.out.println("Fixing sum as " + sum + " from array");

			int a = 0; // number 1 from index 0 of array
			int b = i - 1; // number 2 from last highest number index - 1

			// initiate while loop until number 1 and 2 becomes equal
			while (b > a) {
				int tSum = arr[a] + arr[b]; // sum number 1 and 2
				System.out.println("Summing " + arr[a] + " with " + arr[b] + " = " + tSum);
				
				// if sum is equal to last highest number then return true
				if (sum == tSum) {
					System.out.println(arr[a] + " + " + arr[b] + " = " + sum);
					return true;
				}
				// if sum is lesser than highest number
				// that means number 2 index needs to be decreased
				if (sum > tSum) {
					b--;
				} else { // otherwise increase index of number 1
					a++;
				}
			}
		}
		System.out.println("No pythagorian triplet found");
		return false; // executed if no pair found
	}

}
