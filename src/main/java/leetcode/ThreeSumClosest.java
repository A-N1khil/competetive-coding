package leetcode;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {

		// Sort the array using a library method
		Arrays.sort(nums);

		// Now, we initialize our first pointer to the first element of the array
		int i = 0, j, k; // j and k will be our second and third pointers

		int length = nums.length, currentSum, closestSum = Integer.MAX_VALUE;
		// We start with j to be the next element of i
		// k to be the last element
		for (i = 0; i < length; i++) {
			j = i + 1;
			k = length - 1;
			System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
			while (j < k) {
				currentSum = nums[i] + nums[j] + nums[k];
				if (currentSum == target) {
					// 0 is closest one will ever get, so we return it
					return currentSum;
				}

				// if we haven't achieved the target sum, we need to check if the current sum is closer to the target
				if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
					closestSum = currentSum;
				}

				// If the current sum is less than the target, then we need to increase the sum
				// and since it is a sorted array, moving pointer j to the right will increase the sum
				if (currentSum < target) {
					j++;
				} else {
					// If the current sum is greater than the target, then we need to decrease the sum
					// and since it is a sorted array, moving pointer k to the left will decrease the sum
					k--;
				}
			}
		}
		return closestSum;
	}

	public static void main(String[] args) {
		ThreeSumClosest threeSumClosest = new ThreeSumClosest();
		System.out.println(threeSumClosest.threeSumClosest(new int[]{-1, 2, 1, -4}, 1)); // 2
//		System.out.println(threeSumClosest.threeSumClosest(new int[]{0, 0, 0}, 1)); // 0
//		System.out.println(threeSumClosest.threeSumClosest(new int[]{1, 1, 1, 0}, -100)); // 2
	}
}
