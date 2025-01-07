package leetcode;

/**
 * https://leetcode.com/problems/shifting-letters-ii/
 * You are given a string s of lowercase English letters and a 2D integer array shifts where shifts[i] = [starti, endi, directioni]. For every i, shift the characters in s from the index starti to the index endi (inclusive) forward if directioni = 1, or shift the characters backward if directioni = 0.
 * Shifting a character forward means replacing it with the next letter in the alphabet (wrapping around so that 'z' becomes 'a'). Similarly, shifting a character backward means replacing it with the previous letter in the alphabet (wrapping around so that 'a' becomes 'z').
 * <p>
 * Return the final string after all such shifts to s are applied.
 */
public class ShiftingLettersTwo {

	public static void main(String[] args) {
		String s = "abc";
		int[][] shifts = {{0, 1, 0}, {1, 2, 1}, {0, 2, 1}};
		System.out.println(shiftingLetters(s, shifts));
	}

	/*
	 * Approach: Brute force
	 * Time complexity: O(n^2)
	 */
	private static String shiftingLetters(String s, int[][] shifts) {
		int[] totalShift = new int[s.length()];
		for (int[] shift : shifts) {
			int start = shift[0], end = shift[1];
			int increment = shift[2] == 1 ? 1 : -1;
			for (int i = start; i <= end; i++) {
				totalShift[i] += increment;
			}
		}

		String str = "";
		for (int i = 0; i < s.length(); i++) {
			int asc = ((int) s.charAt(i)) + (totalShift[i] % 26);
			if (asc > 122) {
				asc = 96 + (asc - 122);
			} else if (asc < 97) {
				asc = 123 - (97 - asc);
			}
			str = str + ((char) asc);
		}

		return str;
	}

	/*
	 * Approach: Optimized
	 * Time complexity: O(n)
	 */
	private static String shiftingLettersOptimized(String s, int[][] shifts) {
		int[] totalShift = new int[s.length() + 1];
		for (int[] shift : shifts) {
			int start = shift[0], end = shift[1];
			int increment = shift[2] == 1 ? 1 : -1;
			totalShift[start] += increment;
			totalShift[end + 1] -= increment;
		}

		// Calculate incremental sum
		for (int i = 1; i < s.length(); i++) {
			totalShift[i] += totalShift[i - 1];
		}

		String str = "";
		for (int i = 0; i < s.length(); i++) {
			int asc = ((int) s.charAt(i)) + (totalShift[i] % 26);
			if (asc > 122) {
				asc = 96 + (asc - 122);
			} else if (asc < 97) {
				asc = 123 - (97 - asc);
			}
			str = str + ((char) asc);
		}

		return str;
	}

	public static String shiftingLettersEvenMoreOptimised(String s, int[][] shifts) {
		int n = s.length();
		int[] shift = new int[n + 1];

		for (int[] shiftOp : shifts) {
			int start = shiftOp[0], end = shiftOp[1], direction = shiftOp[2];
			shift[start] += (direction == 1 ? 1 : -1);
			if (end + 1 < n) shift[end + 1] -= (direction == 1 ? 1 : -1);
		}

		int currentShift = 0;
		for (int i = 0; i < n; ++i) {
			currentShift += shift[i];
			shift[i] = currentShift;
		}

		StringBuilder result = new StringBuilder(s);
		for (int i = 0; i < n; ++i) {
			int netShift = (shift[i] % 26 + 26) % 26;
			result.setCharAt(i, (char) ('a' + (s.charAt(i) - 'a' + netShift) % 26));
		}

		return result.toString();

	}
}
