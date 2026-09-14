package leetcode.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	public int lengthOfLIS(int[] nums) {
		int[] dp = new int[nums.length + 1];
		int maxLength = 1;
		Arrays.fill(dp, 1);
		for (int i = 1; i < nums.length; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[j] < nums[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			maxLength = Math.max(maxLength, dp[i]);
		}
		return maxLength;
	}

	public static void main(String[] args) {
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
		int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
		System.out.println(lis.lengthOfLIS(nums)); // Output: 4
		// Additional test cases
		int[] nums2 = {0, 1, 0, 3, 2, 3};
		System.out.println(lis.lengthOfLIS(nums2)); // Output: 4
		int[] nums3 = {7, 7, 7, 7, 7};
		System.out.println(lis.lengthOfLIS(nums3)); // Output: 1
	}
}
