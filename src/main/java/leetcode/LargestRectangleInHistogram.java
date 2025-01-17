package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class LargestRectangleInHistogram {
	public int largestRectangleArea(int[] heights) {
		int maxArea = 0, n = heights.length;

		// Initialize a monotonic stack
		Stack<Integer> stack = new Stack<>();

		// This will hold the left boundary of the rectangle
		int[] left = new int [n];

		// This will hold the right boundary of the rectangle
		int[] right = new int [n];

		// Initialize the right boundary to the last index
		Arrays.fill(right, n);

		for (int i = 0; i < n; i++) {

			// if we encounter an element that is less than the height of the bar at the top of the stack
			// we keep popping the stack until we find a bar that is less than the current bar
			while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
				// save the highest index upto the particular point as the right boundary
				right[stack.pop()] = i;
			}

			// stack is empty or we have no smaller bar than the current bar
			// we set the left bar
			// This would keep a hold of the minimum index of the bar that is less than the current bar
			left[i] = stack.isEmpty() ? -1 : stack.peek();

			// Add the current element to the stack
			stack.push(i);
		}

		// Now we find the array using the difference between the left and the right boundary
		for (int i = 0; i < n; i++) {
			maxArea = Math.max(maxArea, heights[i] * (right[i] - left[i] - 1));
		}

		return maxArea;
	}
}
