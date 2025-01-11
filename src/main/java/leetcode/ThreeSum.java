package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {

		// Sort the array using a library method
		Arrays.sort(nums);

		List<List<Integer>> result = new ArrayList<>();
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) continue;
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int currentSum = nums[i] + nums[j] + nums[k];
				if (currentSum == 0) {
					result.add(Arrays.asList(nums[i], nums[j], nums[k]));

					while (j < k && nums[j] == nums[j + 1]) {
						j++;
					}

					// Skip duplicate elements for k
					while (j < k && nums[k] == nums[k - 1]) {
						k--;
					}

					j++;
					k--;
				} else if (currentSum < 0) {
					j++;
				} else {
					k--;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		ThreeSum threeSum = new ThreeSum();
//		System.out.println(threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4})); // [[-1,-1,2],[-1,0,1]]
//		System.out.println(threeSum.threeSum(new int[]{0, 1, 1}));
//		System.out.println(threeSum.threeSum(new int[]{0, 0, 0}));
//		System.out.println(threeSum.threeSum(new int[]{0, 0, 0, 0}));
		System.out.println(threeSum.threeSum(new int[]{-2, 0, 1, 1, 2}));
	}
}
