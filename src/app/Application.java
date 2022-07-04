package app;

import app.leetcode.ValidParentheses;

public class Application {

	public static void main(String[] args) {
//		String[] strArr = DataGenerator.generateStringArray();

//		System.out.println(LongestCommonPrefix.runV2(strArr));
//		System.out.println(LongestCommonPrefix.runV2(new String[] { "123", "car1", "car2" }));
		boolean result = ValidParentheses.runV3("{[[{]]}");
		System.out.println(result);
	}
}