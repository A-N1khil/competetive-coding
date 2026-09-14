package leetcode.strings;

public class ZigZagPattern {

	public String convert(String s, int numRows) {

		if (numRows == 1) {
			return s;
		}

		int direction = -1;
		StringBuilder[] rows = new StringBuilder[numRows];
		int rowIndex = 0;
		for  (int i = 0; i < numRows; i++) {
			rows[i] = new StringBuilder();
		}
		for (char ch : s.toCharArray()) {
			rows[rowIndex].append(ch);
			if (rowIndex == 0 || rowIndex == numRows - 1) {
				direction = -direction;
			}
			rowIndex += direction;
		}
		StringBuilder result = new StringBuilder();
		for (StringBuilder row : rows) {
			result.append(row);
		}
		return result.toString();
	}
}
