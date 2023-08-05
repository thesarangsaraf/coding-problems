package app.leetcode;

import java.util.ArrayList;

public class FibonacciSeries {

	public static void run() {
		ArrayList<Integer> series = new ArrayList<>();
		series.add(0);
		series.add(1);

		int max = 0;
		int prev = 0;
		int curr = 1;
		while (max < 1000) {
			series.add(series.get(prev) + series.get(curr));
			prev++;
			curr++;
			max = series.get(prev) + series.get(curr);
		}
		System.out.println(series);
	}

}