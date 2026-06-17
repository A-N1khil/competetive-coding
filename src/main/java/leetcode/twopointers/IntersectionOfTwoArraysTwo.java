package leetcode.twopointers;

import java.util.Arrays;

public class IntersectionOfTwoArraysTwo {
	public int[] intersect(int[] nums1, int[] nums2) {
		int[] frequencyCount = new int[1001]; // Given constraint

		for (int num : nums1) {
			frequencyCount[num]++;
		}

		int[] result = new int[Math.max(nums1.length, nums2.length)];
		int index = 0;

		for (int num : nums2) {
			if (frequencyCount[num] > 0) {
				frequencyCount[num]--;
				result[index++] = num;
			}
		}

		return Arrays.copyOf(result, index);
	}

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		IntersectionOfTwoArraysTwo intersection = new IntersectionOfTwoArraysTwo();
		System.out.println(Arrays.toString(intersection.intersect(nums1, nums2)));
	}
}
