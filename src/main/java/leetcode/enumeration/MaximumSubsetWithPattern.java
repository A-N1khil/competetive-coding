package leetcode.enumeration;

import java.util.HashMap;
import java.util.Map;

/**
 * Read the question at the URL for the pattern
 * <a href="https://leetcode.com/problems/find-the-maximum-number-of-elements-in-subset">3020. Maximum Number of Elements in Subset</a>
 */
public class MaximumSubsetWithPattern {
	public int maximumLength(int[] nums) {
		Map<Long, Integer> counts = new HashMap<>();
		for (int num : nums) {
			counts.put((long) num, counts.getOrDefault((long) num, 0) + 1);
		}

		Integer ones = counts.remove(1L);
		ones = ones == null ? 0 : ones;
		int maxLength = 0;
		// Either 0 or the odd number of ones
		// If ones is even, then subtract one to find the previous odd number
		maxLength = Math.max(maxLength, ones % 2 == 0 ? ones - 1 : ones);

		for (long base : counts.keySet()) {
			int currentLength = 0;
			long currentNum = base;
			// currentNum should appear more than two times so that it can cover the start and end of the subset
			// For eg: [2, 4, 8, 4, 2] => For 2 to be counted, it must appear twice, same goes for 4
			while (counts.getOrDefault(currentNum, 0) > 1) {
				currentLength += 2; // our subset increases by twice
				currentNum *= currentNum; // square the current number to get the next number in the pattern
			}

			// The while loop will stop if the count of currentNum is less than 2.
			// So, we need a new condition to handle if there is a single occurrence of currentNum
			// [2, 4, 8, 4, 2] => For 8 to be counted, it must appear once, so we need to check if the count of currentNum is 1
			// Check if 8 exists. If 0, dont add anything. If 1, then reduce length by 1
			currentLength += counts.getOrDefault(currentNum, -1);

			if (currentLength > maxLength) {
				maxLength = currentLength;
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		MaximumSubsetWithPattern maxSubset = new MaximumSubsetWithPattern();
		int[] nums = {2, 4, 8, 4, 2};
		System.out.println(maxSubset.maximumLength(nums)); // Output: 5
		System.out.println(maxSubset.maximumLength(new int[]{1, 1, 1, 1})); // Output: 3
		System.out.println(maxSubset.maximumLength(new int[]{2, 4, 8, 9, 4, 2, 2, 4, 3, 81, 3, 81, 9, 6561})); // Output: 7
	}
}
