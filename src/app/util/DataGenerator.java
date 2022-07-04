package app.util;

import java.util.Random;

public class DataGenerator {

	public static String[] generateStringArray() {
		String[] strArr = new String[999999];

		for (int i = 0; i < 999999; i++) {
			strArr[i] = "Random-String" + new Random().nextDouble();
		}

		return strArr;
	}
}
