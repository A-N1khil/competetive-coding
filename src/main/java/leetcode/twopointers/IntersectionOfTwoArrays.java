package leetcode.twopointers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
	public int[] intersection_slow(int[] nums1, int[] nums2) {
		// Sort both arrays
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Set<Integer> intersection = new HashSet<>();

		int ptr1 = 0, ptr2 = 0;
		while (ptr1 < nums1.length && ptr2 < nums2.length) {
			if (nums1[ptr1] < nums2[ptr2]) {
				ptr1++;
			} else if (nums1[ptr1] > nums2[ptr2]) {
				ptr2++;
			} else {
				intersection.add(nums1[ptr1]);
				ptr1++;
				ptr2++;
			}
		}

		return intersection.stream()
			.mapToInt(Integer::intValue)
			.toArray();
	}

	public int[] intersection(int[] nums1, int[] nums2) {
		int[] result = new int[Math.min(nums1.length, nums2.length)];
		int index = 0;
		boolean[] seen = new boolean[1001]; // Given constraint

		for (int num : nums1) {
			seen[num] = true;
		}

		for (int num : nums2) {
			if (seen[num]) {
				result[index++] = num;
				// Avoid duplicates
				seen[num] = false;
			}
		}

		return Arrays.copyOf(result, index);
	}

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		IntersectionOfTwoArrays intersection = new IntersectionOfTwoArrays();
		System.out.println(Arrays.toString(intersection.intersection(nums1, nums2)));
	}

}
