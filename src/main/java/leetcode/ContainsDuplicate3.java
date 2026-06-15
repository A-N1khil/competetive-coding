package leetcode;

import java.util.TreeSet;

public class ContainsDuplicate3 {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

		TreeSet<Integer> window = new TreeSet<>();
		for (int i = 0; i < nums.length; i++) {

			// First, we check if we have a value in the range nums[i] - valueDiff to nums[i] + valueDiff
			Integer ceiling = window.ceiling(nums[i] - valueDiff);

			if (ceiling != null && ceiling <= (nums[i] + valueDiff)) {
				return true;
			}

			// Add element to window
			window.add(nums[i]);

			// Remove any elements not in the range
			if (i >= indexDiff) {
				window.remove(nums[i - indexDiff]);
			}
		}

		// Fallback
		return false;
	}

	public static void main(String[] args) {
		ContainsDuplicate3 cd = new ContainsDuplicate3();

	}

}
