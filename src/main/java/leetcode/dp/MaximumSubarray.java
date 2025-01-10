package leetcode.dp;

public class MaximumSubarray {

	public int maxSubArray(int[] nums) {
		int maxSum = nums[0], result = nums[0];
		for (int i=1; i< nums.length; i++) {

			// We check if the maximum sum is the current running sum or the current element
			// If the current element is greater than the current running sum, we start a new subarray
			maxSum = Math.max(nums[i], maxSum + nums[i]);
			result = Math.max(result, maxSum);
		}
		return result;
	}

	public static void main(String[] args) {
		MaximumSubarray ms = new MaximumSubarray();
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(ms.maxSubArray(nums));
	}
}
