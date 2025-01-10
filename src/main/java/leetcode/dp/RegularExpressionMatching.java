package leetcode.dp;

public class RegularExpressionMatching {
	public boolean isMatch(String s, String p) {

		int m = s.length(), n = p.length();
		boolean[][] dp = new boolean[m + 1][n + 1];
		dp[0][0] = true; // Empty string matches empty pattern

		for (int i = 0; i <= m; i++) {
			for (int j = 1; j <= n; j++) {

				// If we get an *, we can choose it to match either 0 or n times
				if (p.charAt(j - 1) == '*') {

					// 0 times => reduce the pattern by 2 places ('*' and it's preceding character)
					dp[i][j] = dp[i][j - 2];

					// 'or' 'n' times (note: n is not the same as the n in the outer loop)
					/*
					 * Condition explanation:
					 * i > 0 denotes that we have a valid character in the string
					 * p.charAt(j-2) == '.' denotes the '.' wildcard
					 * p.charAt(j-2) == s.charAt(i-1) denotes that the character in the string matches the character in the pattern
					 */
					if (i > 0 && (p.charAt(j - 2) == '.' || p.charAt(j - 2) == s.charAt(i - 1))) {
						dp[i][j] |= dp[i - 1][j]; // using the bitwise OR here
					}
				} else {
					// we do not have an * => we either have a '.' or a character
					// PS: This is different from the previous condition.
					// Here we are checking if the character in the string matches the character in the pattern
					if (i > 0 && (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i - 1))) {
						dp[i][j] = dp[i - 1][j - 1];
					}
				}
			}
		}

		return dp[m][n];
	}

	public static void main(String[] args) {
		RegularExpressionMatching rem = new RegularExpressionMatching();
		System.out.println(rem.isMatch("aa", "a")); // false
		System.out.println(rem.isMatch("aa", "a*")); // true
		System.out.println(rem.isMatch("ab", ".*")); // true
		System.out.println(rem.isMatch("aab", "c*a*b")); // true
		System.out.println(rem.isMatch("mississippi", "mis*is*p*.")); // false
	}
}
