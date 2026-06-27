package leetcode.dp;

import java.util.Arrays;

public class PerfectSquares {
	public int numSquares(int n) {
		int maxSqrt = (int) Math.sqrt(n);
		int[][] dp = new int[maxSqrt + 1][n + 1];

		// Since we need minimum, we need high values present in the table
		for (int[] rows : dp) {
			Arrays.fill(rows, Integer.MAX_VALUE);
		}

		dp[0][0] = 0;
		// We can only go upto maxSqrt since going above will not be possible to form the number
		for (int i = 1; i <= maxSqrt; i++) {
			int sqr = i*i;
			for (int j=0; j<= n; j++) {
				// Do not use the current square
				dp[i][j] = dp[i - 1][j];

				// Use the current square when j crosses it
				if (j >= sqr) {
					dp[i][j] = Math.min(dp[i][j], dp[i][j - sqr] + 1);
				}
			}
		}

		return dp[maxSqrt][n];
	}
}
