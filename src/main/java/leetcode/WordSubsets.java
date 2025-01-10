package leetcode;

import java.util.LinkedList;
import java.util.List;

public class WordSubsets {

	public boolean isUniversal(int[] wordCount, int[] maxCount) {
		for (int i = 0; i < 26; i++) {
			if (wordCount[i] < maxCount[i]) {
				return false;
			}
		}
		return true;
	}

	public List<String> wordSubsets(String[] words1, String[] words2) {
		List<String> answer = new LinkedList<>();

		// First we count the maximum occurrences of each character in words2
		int[] maxCount = new int[26];
		int[] temp;
		for (String word : words2) {
			temp = new int[26];
			// We do not need to count the total number of occurrences, just the max number
			for (char ch : word.toCharArray()) {
				temp[ch - 'a']++;
				maxCount[ch - 'a'] = Math.max(maxCount[ch - 'a'], temp[ch - 'a']);
			}
		}

		for (String word: words1) {
			temp = new int[26];
			for (char ch : word.toCharArray()) {
				temp[ch - 'a']++;
			}
			if (isUniversal(temp, maxCount)) {
				answer.add(word);
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		WordSubsets ws = new WordSubsets();
		String[] words1 = { "amazon", "apple", "facebook", "google", "leetcode" };
		String[] words2 = { "e", "o" };
		List<String> result = ws.wordSubsets(words1, words2);
		for (String str : result) {
			System.out.println(str);
		}
	}
}
