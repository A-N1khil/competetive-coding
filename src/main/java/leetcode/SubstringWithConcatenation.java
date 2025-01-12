package leetcode;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SubstringWithConcatenation {
	public List<Integer> findSubstring(String s, String[] words) {

		List<Integer> result = new LinkedList<>();
		int n = s.length();
		int w = words[0].length();
		int wordCount = words.length;

		Map<String, Integer> lookup = new LinkedHashMap<>();
		for (String word : words) {
			lookup.merge(word, 1, Integer::sum);
		}

		// Technically, we only need to go from 0 to the length of the first word as we are going to slide the window
		for (int i = 0; i < w; i++) {
			Map<String, Integer> currentCount = new LinkedHashMap<>();
			int left = i, right = i;
			int count = 0;

			// Keep on sliding the window
			while (right + w <= n) {
				String subStr = s.substring(right, right + w);
				// increment right for the next window
				right += w;

				// We are unable to find this word in our table
				if (!lookup.containsKey(subStr)) {
					currentCount.clear();

					// We start over, but from the current right pointer
					left = right;
					count = 0;
					continue;
				}

				// We have found the word => increment the occurrence of the word
				currentCount.merge(subStr, 1, Integer::sum);
				// Also increment the total words we have found
				count++;

				while (currentCount.get(subStr) > lookup.get(subStr)) {
					// We have found more words than we should have
					// We need to move the left pointer to the right
					String leftStr = s.substring(left, left + w);
					currentCount.merge(leftStr, -1, Integer::sum);
					count--;
					left += w;
				}

				if (count == wordCount) {
					// We have found all the words
					result.add(left);
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		SubstringWithConcatenation substringWithConcatenation = new SubstringWithConcatenation();
		System.out.println(substringWithConcatenation.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"})); // [0, 9]
		System.out.println(substringWithConcatenation.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"})); // []
		System.out.println(substringWithConcatenation.findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"})); // [6, 9, 12]
	}
}
