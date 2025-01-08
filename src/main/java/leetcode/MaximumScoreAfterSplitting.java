package leetcode;

public class MaximumScoreAfterSplitting {

	public int maxScore(String s) {

		int score, maxScore = 0, n = s.length();
		int[] left = new int[n], right = new int[n];
		int leftCounter = 0, rightCounter = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '0') {
				leftCounter++;
			}
			if (s.charAt(n - i - 1) == '1') {
				rightCounter++;
			}
			left[i] = leftCounter;
			right[n - i - 1] = rightCounter;
		}
		for (int i = 0; i < n - 1; i++) {
			score = left[i] + right[i + 1];
			maxScore = Math.max(maxScore, score);
		}
		return maxScore;
	}

	public int maxScoreSpaceOptimized(String s) {
		int totalScore = 0, maxScore = 0;

		// We first assume the partition to be at index 1
		// thus, the leftSubstr will be 0th index and rightSubstr will be from 1 to n-1
		if (s.charAt(0) == '0') {
			totalScore++;
		}

		// Now, we calculate the rightSubstr score
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '1') {
				totalScore++;
			}
		}

		// This score is taken by assuming that the partition is at index 1
		maxScore = totalScore;

		// Now, to move forward, we make the partitions go from 1 to n-1
		// As the partitions increase, the total score would increase by 0, since the leftSubstr score counts only 0
		// If we find a 1, we decrease the score
		// The idea here is to extend the leftSubstr till the end, checking if we are able to get a higher score
		// in partitions at index > 1
		for (int i = 1; i < s.length() - 1; i++) {
			totalScore += s.charAt(i) == '0' ? 1 : -1;
			maxScore = Math.max(maxScore, totalScore);
		}
		return maxScore;
	}
}
