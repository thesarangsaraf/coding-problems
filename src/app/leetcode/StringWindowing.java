package app.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringWindowing {

	public static void window(String input, Integer windowSize) {
		List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        List<Integer> counts = new ArrayList<>();

        for (int i = 0; i < input.length() && (i + (windowSize-1) != input.length()); i++) {
			String subStr = input.substring(i, i + windowSize);
            Integer vowelCount = 0;
			for (Character c: subStr.toCharArray()) {
                if (vowels.contains(c)) {
                    vowelCount++;
                }
            } counts.add(vowelCount);
		}
        System.out.println(Collections.max(counts));
	}

}
// abcdefghij
// 0123456789