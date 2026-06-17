package leetcode.strings;

public class StringSpecialOperations2 {
	public char processStr(String s, long k) {
		long length = 0L;

		// Forward pass
		for (char ch : s.toCharArray()) {
			length = switch (ch) {
				case '*' -> Math.max(0, length - 1);
				case '#' -> length * 2;
				case '%' -> length;
				default -> length + 1;
			};
		}

		if (k >= length) {
			return '.';
		}

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);

			if (c == '*') length++;

			else if (c == '#') {
				long half = length / 2;
				if (k >= half) k -= half;
				length = half;
			}

			else if (c == '%') {
				k = length - 1 - k;
			}

			else {
				if (k == length - 1) return c;
				length--;
			}
		}

		return '.';
	}
}
