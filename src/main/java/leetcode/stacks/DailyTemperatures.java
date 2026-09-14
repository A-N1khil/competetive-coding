package leetcode.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		int l = temperatures.length;
		int[] answer = new int[l];
		if (l == 1) {
			return answer;
		}
		Deque<Integer> stack = new ArrayDeque<>();

		for (int i = l - 1; i >= 0; i--) {
			while (!stack.isEmpty() && temperatures[stack.peek()] <= temperatures[i]) {
				stack.pop();
			}
			answer[i] = stack.isEmpty() ? 0 : stack.peek() - i;
			stack.push(i);
		}

		return answer;
	}
}
