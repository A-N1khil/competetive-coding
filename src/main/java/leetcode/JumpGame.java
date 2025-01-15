package leetcode;

public class JumpGame {
	public boolean canJump(int[] nums) {
		int n = nums.length;
		int maxReach = 0, lastMaxReached = 0;
		for (int i=0;i<n-1;i++) {
			maxReach = Math.max(maxReach, i + nums[i]);

			if (lastMaxReached == i) {
				lastMaxReached = maxReach;
				if (maxReach >= n-1) {
					return true;
				}
			}
		}
		return false;
	}
}
