package leetcode.dp;

public class DistinctSubsequences {
	public int numDistinct(String s, String t) {
		int m = s.length(), n = t.length();
		int[][] dp = new int[m + 1][n + 1];

		// Initialize the first row with 1s as there is only one way to form an empty
		// string
		for (int i = 0; i <= m; i++) {
			dp[i][0] = 1;
		}

		// Now we fill the dp array
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s.charAt(i - 1) == t.charAt(j - 1)) {
					// If the characters match, we can either include or exclude the character
					dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
				} else {
					// If the characters do not match, we can only exclude the character
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		return dp[m][n];
	}
}
