package leetcode.strings;

/*
A '*' removes the last character from result, if it exists.
A '#' duplicates the current result and appends it to itself.
A '%' reverses the current result.
 */

public class StringSpecialOperations {
	public String processStr(String s) {
		StringBuilder result = new StringBuilder();

		for (Character ch : s.toCharArray()) {
			if (ch == '*') {
				if (!result.isEmpty()) {
					result.deleteCharAt(result.length() - 1);
				}
			} else if (ch == '#') {
				result.append(result);
			} else if (ch == '%') {
				result.reverse();
			} else {
				result.append(ch);
			}
		}

		return result.toString();
	}

	public static void main(String[] args) {
		String x = "a#b%*";
		StringSpecialOperations s = new StringSpecialOperations();
		System.out.println(s.processStr(x));
	}
}
