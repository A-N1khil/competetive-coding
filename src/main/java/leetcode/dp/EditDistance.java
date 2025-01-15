package leetcode.dp;

public class EditDistance {
	public int editDistance(String word1, String word2) {
		int m = word1.length(), n = word2.length();
		int[][] dp = new int[m + 1][n + 1];

		// To convert an empty string into word2, we have to add characters from word2
		// Hence, the first column will always be the number of characters of word2
		for (int j = 1; j < n; j++) {
			dp[0][j] = j;
		}

		// Now, we fill out the rest of the table
		for (int i = 1; i <= m; i++) {
			// To convert word1 into an empty string, we have to remove characters from word1
			dp[i][0] = i;
			for (int j = 1; j <= n; j++) {
				// If both words ar the same, we do not make any changes, keeping the value same as the diagonal
				if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					int insert = dp[i][j - 1]; // Insert the same character into word1
					int delete = dp[i - 1][j]; // Delete the character from word1
					int replace = dp[i - 1][j - 1]; // Replace

					dp[i][j] = 1 + Math.min(insert, Math.min(delete, replace));
				}
			}
		}
		return dp[m][n];
	}
}
