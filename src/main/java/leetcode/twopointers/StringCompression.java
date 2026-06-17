package leetcode.twopointers;

/**
 * <a href="https://leetcode.com/problems/string-compression">443. String Compression</a>
 */
public class StringCompression {
	public int compress(char[] chars) {
		int counter = 1;
		int runningIndex = 0;
		for (int i = 1; i < chars.length; i++) {
			// Same character
			if (chars[i] == chars[i - 1]) {
				counter++;
			} else {
				chars[runningIndex++] = chars[i - 1];
				if (counter > 1) {
					// Keep adding digits
					for (char c : String.valueOf(counter).toCharArray()) {
						chars[runningIndex++] = c;
					}
				}
				// Reset counter
				counter = 1;
			}
		}

		// Reached end of array. Add final
		chars[runningIndex++] = chars[chars.length - 1];
		if (counter > 1) {
			// Keep adding digits
			for (char c : String.valueOf(counter).toCharArray()) {
				chars[runningIndex++] = c;
			}
		}
		return runningIndex;
	}
}
