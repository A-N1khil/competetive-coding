package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	public List<List<Integer>> fourSum(int[] nums, int target) {

		// Sort the array
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) continue;
			for (int j = i + 1; j < nums.length - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) continue;
				int k = j + 1;
				int l = nums.length - 1;
				while (k < l) {
					// break current sum into 2 different parts to prevent overflow
					long currentSum = nums[i] + nums[j];
					currentSum += nums[k] + nums[l];
					if (currentSum == target) {
						result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
						while (k < l && nums[k] == nums[k + 1]) {
							k++;
						}
						while (k < l && nums[l] == nums[l - 1]) {
							l--;
						}
						k++;
						l--;
					} else if (currentSum < target) {
						k++;
					} else {
						l--;
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		FourSum fourSum = new FourSum();
//		System.out.println(fourSum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0)); // [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
//		System.out.println(fourSum.fourSum(new int[]{2, 2, 2, 2, 2}, 8)); // [[2,2,2,2]]
//		System.out.println(fourSum.fourSum(new int[]{2, 2, 2, 2, 2, 2}, 8)); // [[2,2,2,2]]
		System.out.println(fourSum.fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296));
	}
}
