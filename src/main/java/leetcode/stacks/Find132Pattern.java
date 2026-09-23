package leetcode.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Find132Pattern {
	public boolean find132pattern(int[] nums) {
		int middleValue = Integer.MIN_VALUE;
		Deque<Integer> stack = new ArrayDeque<>();
		for (int i = nums.length - 1; i >= 0; i--) {
			/*
			 Consider this situation after we have a max value (k) in the stack
			 and the popped value out in the middle
			 Since, we are traversing from right to left, we know that
			 	* the position of the popped value is less than the position of the max value (k)
				* the position of the current value is less than the position of the popped value
			 So, if the current value is less than the popped value, we have found a 132 pattern
			 132 pattern: current value < popped value < max value (k)
			 132 pattern: nums[i] < middleValue < stack.peek()
			*/
			if (nums[i] < middleValue) {
				return true;
			}
			// Store the maximum number in the stack
			while (!stack.isEmpty() && nums[i] > stack.peek()) {
				middleValue = stack.pop();
			}
			stack.push(nums[i]);
		}
		return false;
	}
}
