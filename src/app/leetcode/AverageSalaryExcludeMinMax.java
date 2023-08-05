package app.leetcode;

import java.util.Arrays;

public class AverageSalaryExcludeMinMax {

	public static double average(int[] salary) {
		Arrays.sort(salary);

		if (salary.length == 3) {
			return salary[1];
		}

		int sum = 0;
		for (int i = 1; i < salary.length - 1; i++) {
			sum = sum + salary[i];
		}

		return (double) sum / (salary.length - 2);
	}

}