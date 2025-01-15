package leetcode.dp;

import java.util.Arrays;

public class UniquePaths {
	public int uniquePaths(int m, int n) {

		// Initialize an array of the number of columns
		int[] cols = new int[n];

		// Initialize the first row with 1s, as there is only one way to reach it
		Arrays.fill(cols, 1);

		// Now we start of with the second row
		// Since we are using the same array, the value of any cell will always contain the number of ways to reach it
		// from above
		// We just need to add the number of ways from the left, which is being held by the previous cell
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				cols[j] += cols[j - 1];
			}
		}

		return cols[n - 1];
	}
}
