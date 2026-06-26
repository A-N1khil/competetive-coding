package leetcode.dp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DifferentWaysToAddParentheses {
	private final Map<String, List<Integer>> memo = new HashMap<>();

	public List<Integer> diffWaysToCompute(String expression) {
		if (memo.containsKey(expression)) {
			return memo.get(expression);
		}

		List<Integer> results = new ArrayList<>();

		// Constraint on numbers being from 0 to 99
		if (expression.length() < 3) {
			results.add(Integer.parseInt(expression));
			return results;
		}

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);

			if (c == '+' || c == '-' || c == '*') {
				List<Integer> left = diffWaysToCompute(expression.substring(0, i));
				List<Integer> right = diffWaysToCompute(expression.substring(i + 1));

				for (int leftValues : left) {
					for (int rightValues : right) {
						if (c == '+') {
							results.add(leftValues + rightValues);
						} else if (c == '-') {
							results.add(leftValues - rightValues);
						} else {
							results.add(leftValues * rightValues);
						}
					}
				}
			}
		}
		memo.put(expression, results);
		return results;
	}

	public static void main(String[] args) {
		DifferentWaysToAddParentheses diff = new DifferentWaysToAddParentheses();
		List<Integer> res = diff.diffWaysToCompute("2*3-4*5");
		System.out.println(res);
	}
}
