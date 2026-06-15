package leetcode;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindowMaximum {
	public int[] maxSlidingWindow_1(int[] nums, int k) {

		int[] result = new int[nums.length - k + 1];
		int resultIndex = 0;
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
			if (a[0] == b[0]) {
				return a[1] - b[1]; // Ascending index if values are equal
			}
			return b[0] - a[0]; // Max value at the top
		});

		// Add the first sliding window - 1 into the queue
		for (int i = 0; i < k - 1; i++) {
			pq.offer(new int[]{nums[i], i});
		}

		// Start with k - 1
		for (int i = k - 1; i < nums.length; i++) {
			pq.offer(new int[]{nums[i], i});
			// Remove elements outside qindow
			while (pq.peek()[1] <= i - k) {
				pq.poll();
			}
			result[resultIndex++] = pq.peek()[0];
		}
		return result;
	}

	public int[] maxSlidingWindow_optimal(int[] nums, int k) {
		int resultIndex = 0;
		int[] result = new int[nums.length - k + 1];

		ArrayDeque<Integer> deque = new ArrayDeque<>();
		ArrayDeque<Integer> deque1 = new ArrayDeque<>(Collections.emptyList());
		ArrayDeque<Integer> deque2 = new ArrayDeque<>(21);

		return result;
	}

	public static void main(String[] args) {
		SlidingWindowMaximum swm = new SlidingWindowMaximum();
		int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
		int k = 3;
		int[] result = swm.maxSlidingWindow_1(nums, k);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
