package leetcode.stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement2 {
	public int[] nextGreaterElements(int[] nums) {
		int length = nums.length;
		int[] result = new int[length];
		Arrays.fill(result, -1);
		Deque<Integer> stack = new ArrayDeque<>();
		for (int i = length * 2 - 1; i >= 0; i--) {
			// Circular index calculation
			int currentIndex = i % length;
			while (!stack.isEmpty() && stack.peek() <= nums[currentIndex]) {
				stack.pop();
			}
			if (!stack.isEmpty() && i < length) {
				result[currentIndex] = stack.peek();
			}
			stack.push(nums[currentIndex]);
		}
		return result;
	}
}
