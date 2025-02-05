package leetcode.dp;

public class InterleavingString {
	public boolean isInterleave(String s1, String s2, String s3) {
		int l1 = s1.length(), l2 = s2.length(), l3 = s3.length();
		if (l1 + l2 != l3) {
			return false;
		}
		boolean[][] dp = new boolean[l1 + 1][l2 + 1];
		dp[0][0] = true;

		// Check the first string against s3 assuming s2 is empty
		for (int i = 1; i <= l1; i++) {
			dp[i][0] = dp[i - 1][0] && s1.charAt(i - 1) == s3.charAt(i - 1);
		}

		// Check the second string against s3 assuming s1 is empty
		for (int j = 1; j <= l2; j++) {
			dp[0][j] = dp[0][j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
		}

		// Now we check for both the strings
		for (int i = 1; i <= l1; i++) {
			for (int j = 1; j <= l2; j++) {
				if (s1.charAt(i - 1) == s3.charAt(i + j - 1)) {
					// s3 matches the last character of s1, so we move to the previous character of
					// s1
					dp[i][j] = dp[i - 1][j];
				}
				if (s2.charAt(j - 1) == s3.charAt(i + j - 1)) {
					// s3 matches the last character of s2, so we move to the previous character of
					// s2
					dp[i][j] |= dp[i][j - 1];
				}
			}
		}
		return dp[l1][l2];
	}
}
