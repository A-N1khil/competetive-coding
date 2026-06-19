package leetcode.twopointers;

import java.util.List;

public class LongestWordInDictionary {

	boolean isSubsequence(String word, String source) {
		int wordIndex = 0;
		for (int i = 0; i < source.length() && wordIndex < word.length(); i++) {
			if (word.charAt(wordIndex) == source.charAt(i)) {
				wordIndex++;
			}
		}
		return wordIndex == word.length();
	}

	public String findLongestWord(String s, List<String> dictionary) {
		String longestWord = "";
		int longestLength = 0;
		for (String word : dictionary) {
			int wordLength = word.length();
			if (isSubsequence(word, s) &&
				((longestLength < wordLength)
					|| (longestLength == wordLength && longestWord.compareTo(word) < 0))) {
				longestWord = word;
				longestLength = wordLength;
			}
		}
		return longestWord;
	}

	public static void main(String[] args) {
		LongestWordInDictionary longestWordInDictionary = new LongestWordInDictionary();
		System.out.println(longestWordInDictionary.findLongestWord("abpcplea", List.of("ale", "apple", "monkey", "plea")));
		System.out.println(longestWordInDictionary.findLongestWord("bab", List.of("ba","ab","a","b")));
	}
}
