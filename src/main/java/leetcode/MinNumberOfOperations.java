package leetcode;

/*
 * Problem: https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/
 *
 * You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty,
 * and '1' if it contains one ball.
 * In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1.
 * Note that after doing so, there may be more than one ball in some boxes.
 * Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.
 * Each answer[i] is calculated considering the initial state of the boxes.
 */
public class MinNumberOfOperations {
	public int[] minOperations(String boxes) {
		int len = boxes.length();
		int[] ans = new int[len];
		int counter = 0;

		for (int i = 1; i < len; i++) {
			counter += (((int) boxes.charAt(i - 1)) - 48);
			ans[i] = ans[i - 1] + counter;
		}

		counter = 0;
		int sum = 0;
		for (int i = len - 2; i >= 0; i--) {
			counter += (((int) boxes.charAt(i + 1)) - 48);
			sum += counter;
			ans[i] += sum;
		}
		return ans;
	}

	public static void main(String[] args) {

		String boxes = "110";
		MinNumberOfOperations minNumberOfOperations = new MinNumberOfOperations();
		int[] ans = minNumberOfOperations.minOperations(boxes);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
