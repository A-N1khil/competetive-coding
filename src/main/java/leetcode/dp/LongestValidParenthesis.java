package leetcode.dp;

import java.util.Stack;

public class LongestValidParenthesis {

	public int longestValidParentheses(String s) {
		int maxLength = 0, n = s.length(), open = 0, close = 0;

		// Left to right
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '(') open++;
			else close++;

			if (open == close) {
				maxLength = Math.max(maxLength, open + close);
			} else if (close > open) {
				open = close = 0;
			}
		}

		// Right to left
		open = close = 0;
		// Left to right
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == '(') open++;
			else close++;

			if (open == close) {
				maxLength = Math.max(maxLength, open + close);
			} else if (open > close) {
				open = close = 0;
			}
		}

		return maxLength;
	}

	public int longestValidParenthesisStack(String s) {
		int maxLength = 0, n = s.length();
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '(') {
				// push the index into the stack
				stack.push(i);
			} else {
				stack.pop();
				if (stack.isEmpty()) {
					stack.push(i);
				} else {
					maxLength = Math.max(maxLength, i - stack.peek());
				}
			}
		}
		return maxLength;
	}

	public static void main(String[] args) {
		LongestValidParenthesis lvp = new LongestValidParenthesis();
//		System.out.println(lvp.longestValidParentheses("(()"));
//		System.out.println(lvp.longestValidParentheses(")()(()))"));
//		System.out.println(lvp.longestValidParentheses("))())"));
//		System.out.println(lvp.longestValidParenthesisStack("(()"));
//		System.out.println(lvp.longestValidParenthesisStack(")()(()))"));
//		System.out.println(lvp.longestValidParenthesisStack("))())"));
		System.out.println(lvp.longestValidParenthesisStack("()"));
	}
}
