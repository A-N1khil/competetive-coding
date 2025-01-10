package leetcode.dp;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

	private void genP(int open, int close, int n, StringBuilder str, List<String> result) {
		/*
		Base cases:
		1. If open > n and close == n, then return
		2. If close > n, then return
		3. If open < close, then return
		 */
		if (open > n || close > n || open < close) {
			return;
		}

		// We have reached the max pairs
		if (open == n && close == n) {
			result.add(str.toString());
			return;
		}

		// Recurse
		genP(open + 1, close, n, str.append("("), result);
		str.setLength(str.length() - 1);
		genP(open, close + 1, n, str.append(")"), result);
		str.setLength(str.length() - 1);
	}

	public List<String> generateParenthesis(int n) {

		if (n == 0) {
			return new ArrayList<>();
		} else if (n == 1) {
			List<String> result = new ArrayList<>();
			result.add("()");
			return result;
		} else {
			List<String> result = new ArrayList<>();
			genP(0, 0, n,  new StringBuilder(), result);
			return result;
		}
	}

	public static void main(String[] args) {
		GenerateParenthesis gp = new GenerateParenthesis();
		List<String> result = gp.generateParenthesis(3);
		for (String str : result) {
			System.out.println(str);
		}
	}


}
