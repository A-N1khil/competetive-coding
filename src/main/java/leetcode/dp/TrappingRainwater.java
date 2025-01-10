package leetcode.dp;

public class TrappingRainwater {

	// We will follow a prefix suffix approach
	public int trap(int[] height) {
		int len = height.length;
		int[] left = new int[len];
		int[] right = new int[len];

		// save the left[0] to be height[0] and right[len-1] to be height[len-1]
		left[0] = height[0];
		right[len - 1] = height[len - 1];

		// traverse from left to right to find the maximum at that particular index
		for (int i = 1; i < len; i++) {
			left[i] = Math.max(left[i - 1], height[i]);
		}

		// traverse from right to left to find the maximum at that particular index
		for (int i = len - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], height[i]);
		}

		int water = 0;
		// calculate the water trapped at each index
		// we do that by taking the minimum of the maximum height from left and right and subtracting the height at that index
		for (int i = 0; i < len; i++) {
			water += Math.min(left[i], right[i]) - height[i];
		}

		return water;
	}

	public int trapTwoPointer(int[] height) {
		int lMax = 0, rMax = 0, left = 1, right = height.length - 2, water = 0;
		lMax = height[left - 1];
		rMax = height[right + 1];

		while (left <= right) {

			// if the left height is less than the right height, we can trap water at the left index
			// and increment from left
			if (lMax < rMax) {
				// However, if we find a height greater than the left max, we update the left max and do not trap water
				if (height[left] > lMax) {
					lMax = height[left];
				} else {
					water += lMax - height[left]; // maximum height + height underneath
				}
				left++;
			} else {
				// if the right height is less than the left height, we can trap water at the right index
				// and decrement from right
				if (height[right] > rMax) {
					rMax = height[right];
				} else {
					water += rMax - height[right];
				}
				right--;
			}
		}
		return water;
	}

	public static void main(String[] args) {
		TrappingRainwater tr = new TrappingRainwater();
		System.out.println(tr.trap(new int[] { 0,1,0,2,1,0,1,3,2,1,2,1 })); // 6
		System.out.println(tr.trapTwoPointer(new int[] { 0,1,0,2,1,0,1,3,2,1,2,1 })); // 6
	}
}
