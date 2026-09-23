package leetcode.stacks;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubArray {
	public int findUnsortedSubarray(int[] nums) {
		int length = nums.length;
		int[] sortedNums = Arrays.copyOf(nums, length);
		Arrays.sort(sortedNums);
		int left = 0, right = length - 1;
		while (left <= right && nums[left] == sortedNums[left]) {
			left++;
		}

		while (left <= right && nums[right] == sortedNums[right]) {
			right--;
		}

		return right - left + 1;
	}
}
