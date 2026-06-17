package leetcode.twopointers;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/rotate-array">Rotate Array</a>
 */
public class RotateArray {

	void reverseArray(int start, int end, int[] nums) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;

			start++;
			end--;
		}
	}

	public void rotate(int[] nums, int k) {
		// k can be larger than the size of the array, so find the final k by modulo
		int length = nums.length;
		k %= length;

		// Reverse the entire array so that backward elements can come front
		reverseArray(0, length - 1, nums);

		// Reverse the first k elements => Gives back the correct order in the front of the array
		reverseArray(0, k - 1, nums);

		// Finally reverse the remaining elements to get the correct order in the back of the array
		reverseArray(k, length - 1, nums);
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		RotateArray r = new RotateArray();
		r.rotate(arr, 3);
		System.out.println(Arrays.stream(arr).boxed().toList());
	}
}
