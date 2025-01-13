package leetcode;

public class RomanToInteger {

	public int romanToInt(String s) {
		int result = 0;
		int prev = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			int current = romanCharToInt(s.charAt(i));
			if (current < prev) {
				result -= current;
			} else {
				result += current;
			}
			prev = current;
		}
		return result;
	}

	private int romanCharToInt(char c) {
		return switch (c) {
			case 'I' -> 1;
			case 'V' -> 5;
			case 'X' -> 10;
			case 'L' -> 50;
			case 'C' -> 100;
			case 'D' -> 500;
			case 'M' -> 1000;
			default -> 0;
		};
	}
}
