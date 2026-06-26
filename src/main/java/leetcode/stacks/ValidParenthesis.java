package leetcode.stacks;

import java.util.Stack;

public class ValidParenthesis {
	public boolean isValid(String s) {
		// Empty or odd length strings are always invalid
		if (s.isEmpty() || s.length() % 2 == 1) {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty()) {
					// Closing bracket without a matching opening bracket in the stack
					return false;
				}
				// Check for closing bracket at stack top
				char c = stack.peek();
				if (((ch == ')') && (c != '(')) || ((ch == ']') && (c != '[')) || ((ch == '}') && (c != '{'))) {
					return false;
				}
				// Correct bracket, pop and continue
				stack.pop();
			} else {
				stack.push(ch);
			}
		}
		return stack.isEmpty();
	}
}
