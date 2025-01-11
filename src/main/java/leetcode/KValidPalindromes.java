package leetcode;

public class KValidPalindromes {
	public boolean canConstruct(String s, int k) {

		// If the length of s is less than k, then we cannot form k palindromes
		if (s.length() < k) return false;

		/*
		 * Conditions that will get us valid palindromes
		 * Even count of characters => All characters can be used to form palindromes
		 * Odd count of characters => All characters can be used to form palindromes if they are placed in the middle
		 * of the palindrome. However, if the number of odd characters is greater than k, then we cannot form k palindromes
		 */
		int[] charCount = new int[26];
		for (char c : s.toCharArray()) {
			charCount[c - 'a']++;
		}

		int oddChars = 0;
		for (int count : charCount) {
			if (count % 2 != 0) {
				oddChars++;
			}
		}

		return oddChars <= k;
	}

	public static void main(String[] args) {
		KValidPalindromes kValidPalindromes = new KValidPalindromes();
		System.out.println(kValidPalindromes.canConstruct("annabelle", 2)); // true
		System.out.println(kValidPalindromes.canConstruct("leetcode", 3)); // false
		System.out.println(kValidPalindromes.canConstruct("true", 4)); // true
	}
}
