package leetcode.twopointers;

import java.util.Arrays;

public class ValidTriangleNumber {

	public int triangleNumber(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		for (int large = nums.length - 1; large >= 2; large--) {
			int left = 0, right = large - 1;
			while (left < right) {
				if (nums[left] + nums[right] > nums[large]) {
					/*
					 * Since the array is sorted, all numbers from left+1 will be greater nums[left]
					 * Thus nums[left+1] + nums[right] >= nums[left] + nums[right]
					 * Hence, all of them can form triangles
					 */
					count += right - left;
					// Move to the next smallest right
					right--;
				} else {
					// Sum is too small, need bigger numbers
					left++;
				}
			}
		}
		return count;
	}
}
