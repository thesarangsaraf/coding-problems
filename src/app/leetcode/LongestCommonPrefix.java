package app.leetcode;

/*

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Solution :
1. Longest common prefix in the entire array
2. Take first index string from the array
3. Create a reducing window for strs[0] to start scanning with longest prefix first and keep reducing the window
4. If matching prefix found in the entire elements of array then return that prefix

*/

public class LongestCommonPrefix {

	// strArray = { "dog", "racecar", "car" }
	public static String runV1(String[] strs) {
		String longestPrefix = "";

		// main loop to iterate array elements
		for (int i = 0; i < strs.length; i++) {
			String strElement = strs[i];
			int strElementLength = strElement.length();

			for (int j = strElementLength; j > 0; j--) {
				String subStr = strElement.substring(0, j);
				boolean isLongest = false;

				// again loop through all elements
				for (int k = 0; k < strs.length; k++) {
					String targetStr = strs[k];
//					System.err.println(subStr + " =StartsWith= " + targetStr);

					if (targetStr.startsWith(subStr)) {
						isLongest = true;
					} else {
						isLongest = false;
						break;
					}
				}
				if (isLongest) {
					longestPrefix = subStr;
					System.out.println("LONGEST == " + longestPrefix);
					return longestPrefix;
				} else {
//					System.out.println("FALSE");
				}
			}
		}
		return longestPrefix;
	}

	public static String runV2(String[] strs) {
		String longestPrefix = "";
		String firstIndStr = strs[0];

		// create a reducing window for string[0]
		main: for (int i = firstIndStr.length(); i > 0; i--) {
			String prefix = firstIndStr.substring(0, i);
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].startsWith(prefix)) {
					continue;
				} else {
					continue main;
				}
			}
			return prefix;
		}

		return longestPrefix;
	}
}