package leetcode;

public class MinimumLengthOfStringAfterOperations {

	public int minimumLength(String s) {
		int n = s.length();
		if (n < 3) {
			return n;
		}

		int[] lookup = new int[26];

		// Count the number of occurrences of the string
		for (char c : s.toCharArray()) {
			lookup[c - 'a']++;
		}

		/*
		 * The idea here is to remove all the sets of characters that occur more than 3 times in the string,
		 * reducing them to just one occurrence
		 * Because, if there are 3 occurrences of each character, we can be sure that there will be one in the middle,
		 * and remove the other two
		 * We dont have to care about the indices too
		 */
		int totalLength = 0;
		for (int i = 0; i < 26; i++) {
			/*
			 * After the operations, we will only be left with either 2 or 1 occurrences of the character
			 * If we have even occurrences, we will always be left with 2 characters after the operations
			 * If we have odd occurrences, we will always be left with 1 character after the operations
			 */
			if (lookup[i] == 0) continue;
			totalLength += lookup[i] % 2 == 0 ? 2 : 1;
		}
		return totalLength;
	}

	public static void main(String[] args) {
		MinimumLengthOfStringAfterOperations minimumLengthOfStringAfterOperations = new MinimumLengthOfStringAfterOperations();
		System.out.println(minimumLengthOfStringAfterOperations.minimumLength("abaacbcbb")); // 5
		System.out.println(minimumLengthOfStringAfterOperations.minimumLength("aabacbbaa")); // 3
		System.out.println(minimumLengthOfStringAfterOperations.minimumLength("aa")); // 2

	}
}
