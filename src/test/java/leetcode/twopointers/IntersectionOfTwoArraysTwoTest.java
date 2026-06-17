package leetcode.twopointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionOfTwoArraysTwoTest {

	private final IntersectionOfTwoArraysTwo solution = new IntersectionOfTwoArraysTwo();

	@Test
	void example1() {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};

		String result = Arrays.toString(solution.intersect(nums1, nums2));

		assertEquals("[2, 2]", result);
	}

	@Test
	void example2() {
		int[] nums1 = {4, 9, 5};
		int[] nums2 = {9, 4, 9, 8, 4};

		String result = Arrays.toString(solution.intersect(nums1, nums2));

		// Assertequals with OR condition
		assertThat(result).isIn("[4, 9]", "[9, 4]");
	}

	@Test
	void emptyArrays() {
		int[] nums1 = {4, 9, 5};
		int[] nums2 = {};

		String result = Arrays.toString(solution.intersect(nums1, nums2));

		// Assertequals with OR condition
		assertThat(result).isIn("[]", "[]");
	}
}