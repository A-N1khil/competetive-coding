package leetcode.slidingwindow;

public class SubstringWithAll3Characters {
	public int numberOfSubstrings(String s) {
		int[] lastPos = { -1, -1, -1 };
		int totalCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			lastPos[ch - 'a'] = i;
			int minPos = Math.min(lastPos[0], Math.min(lastPos[1], lastPos[2]));
			totalCount += minPos + 1;
		}
		return totalCount;
	}

	public static void main(String[] args) {
		SubstringWithAll3Characters solution = new SubstringWithAll3Characters();
		String s = "abcabc";
		System.out.println(solution.numberOfSubstrings(s)); // Output: 10
		// Additional test cases
		String s2 = "aaacb";
		System.out.println(solution.numberOfSubstrings(s2)); // Output: 3
		String s3 = "ababab";
		System.out.println(solution.numberOfSubstrings(s3)); // Output: 0
	}
}
