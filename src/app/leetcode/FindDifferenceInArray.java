package app.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceInArray {

//	Input: nums1 = [1,2,3], nums2 = [2,4,6]
//	Output: [[1,3],[4,6]]

	public static List<List<Integer>> runV1(int[] nums1, int[] nums2) {
		List<List<Integer>> result = new ArrayList<>();

		List<Integer> arr1 = new ArrayList<>();
		for (int i = 0; i < nums1.length; i++) {
			int num1 = nums1[i];
			boolean isPresent = false;
			for (int j = 0; j < nums2.length; j++) {
				int num2 = nums2[j];
				if (num1 == num2) {
					isPresent = true;
					break;
				}
			}
			if (!isPresent && !arr1.contains(num1)) {
				arr1.add(num1);
			}
		}

		List<Integer> arr2 = new ArrayList<>();
		for (int i = 0; i < nums2.length; i++) {
			int num2 = nums2[i];
			boolean isPresent = false;
			for (int j = 0; j < nums1.length; j++) {
				int num1 = nums1[j];
				if (num2 == num1) {
					isPresent = true;
					break;
				}
			}
			if (!isPresent && !arr2.contains(num2)) {
				arr2.add(num2);
			}
		}
		result.add(arr1);
		result.add(arr2);
		return result;
	}

	public static List<List<Integer>> runV2(int[] nums1, int[] nums2) {
		List<List<Integer>> result = new ArrayList<>();
		Set<Integer> arrSet1 = new HashSet<>();
		Set<Integer> arrSet2 = new HashSet<>();
		List<Integer> arr1 = new ArrayList<>();
		List<Integer> arr2 = new ArrayList<>();
		
		for (int num: nums1) arrSet1.add(num);
		for (int num: nums2) arrSet2.add(num);
		
		for (Integer num : arrSet1) {
			if (!arrSet2.contains(num)) {
				arr1.add(num);
			}
		}

		for(Integer num: arrSet2) {
			if (!arrSet1.contains(num)) {
				arr2.add(num);
			}
		}
		result.add(arr1);
		result.add(arr2);
		System.out.println(result);
		return result;

	}

}