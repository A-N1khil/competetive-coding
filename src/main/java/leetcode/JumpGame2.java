package leetcode;

public class JumpGame2 {
	public int jump(int[] nums) {

		// Initialize step
		int step = 0, n = nums.length;
		int maxReach = 0, lastMaxReached = 0;

		// We iterate from 0 to n-1, as we don't need to jump from the last element
		for (int i=0; i<n-1; i++) {
			// we calculate the maximum reach from the current element
			maxReach = Math.max(maxReach, i + nums[i]);

			// We check if the lastReach brought us to i
			if (lastMaxReached == i) {

				// We update the lastMaxReached to the maxReach
				lastMaxReached = maxReach;

				// We increment the step
				step++;

				if (maxReach >= n-1) {
					// We have overshot the last element, which means we can reach it in the jump
					// so we break the loop
					break;
				}
			}
		}
		return step;
	}
}
