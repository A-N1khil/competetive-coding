package leetcode.dp;

import java.util.Arrays;

public class LongestPalindrome {

	public String longestPalindrome(String s) {
		int n = s.length();
		// Initialize dp array
		boolean[][] dp = new boolean[n][n];

		for (boolean[] row : dp) {
			// mark all as true
			// We will be marking individual cells as false later on
			Arrays.fill(row, true);
		}

		int start = 0, maxLength = 1;

		// we start with the 2nd last character (build dp in bottom up manner)
		for (int i = n - 2; i >= 0; i--) {
			// we check from i+1 to n-1
			for (int j = i + 1; j < n; j++) {
				// init dp[i][j] as false
				dp[i][j] = false;
				// check if the substr from i to j is palindrome
				// => first and last character are same
				// => the substring from i+1 to j-1 is palindrome
				if (s.charAt(i) == s.charAt(j)) {
					// if i and j are adjacent, this one will be true as all individual cells are true
					// if i and j are not adjacent, this will hold the value of the shorter substring from i+1 to j-1
					dp[i][j] = dp[i + 1][j - 1];
					if (dp[i][j] && maxLength < j - i + 1) {
						// we have established that the substring from i to j is palindrome
						// check if this is the longest palindrome
						maxLength = j - i + 1;
						// and we set the start to i to extract later
						start = i;
					}
				}
			}
		}

		// extract the longest palindrome
		return s.substring(start, start + maxLength);
	}

	public static void main(String[] args) {
		String s = "babba";
		LongestPalindrome longestPalindrome = new LongestPalindrome();
		System.out.println(longestPalindrome.longestPalindrome(s));
	}

}
