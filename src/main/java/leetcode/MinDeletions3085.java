package leetcode;

public class MinDeletions3085 {

	public int minDeletions(String s, int k) {
		int[] freq = new int[26];

		// Count the frequency of each character
		for (char c : s.toCharArray()) {
			freq[c - 'a']++;
		}

		int count = 0;
		for (int i = 0; i < 26; i++) {
			for (int j = i + 1; j < 26; j++) {
				if (freq[i] > 0 && freq[j] > 0 && Math.abs(freq[i] - freq[j]) > k) {
					if (freq[i] > freq[j]) {
						freq[i]--;
					} else {
						freq[j]--;
					}
					count++;
				}
			}
		}
		return count;
	}
}
