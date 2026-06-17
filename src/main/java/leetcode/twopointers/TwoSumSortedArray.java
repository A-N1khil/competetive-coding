package leetcode.twopointers;

import java.util.Arrays;

public class TwoSumSortedArray {
	public int[] twoSum(int[] numbers, int target) {
		int left = 0, right = numbers.length - 1;
		while (left != right) {
			int sum = numbers[left] + numbers[right];
			if (sum < target) {
				left++;
			} else if (sum > target) {
				right--;
			} else {
				return new int[]{left + 1, right + 1};
			}
		}
		// Fallback
		return new int[]{left + 1, right + 1};
	}

	public static void main(String[] args) {
		TwoSumSortedArray two = new TwoSumSortedArray();
		System.out.println(Arrays.toString(two.twoSum(new int[]{2, 7, 11, 15}, 9)));
	}

}
