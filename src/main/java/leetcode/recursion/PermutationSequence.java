package leetcode.recursion;

import java.util.Arrays;

public class PermutationSequence {
	public String getPermutation(int n, int k) {
		StringBuilder result = new StringBuilder();
		boolean[] visited = new boolean[n + 1];

		// Pre compute factorials
		int[] factorial = new int[n + 1];
		Arrays.fill(factorial, 1);
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f *= i;
			factorial[i] = f;
		}

		for (int pos = 1; pos <= n; pos++) {
			for (int i = 1; i <= n; i++) {
				if (!visited[i]) {
					int fact =  factorial[n - pos];
					if (k > fact) {
						k -= fact;
					} else {
						result.append(i);
						visited[i] = true;
						break;
					}
				}
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		int n = 4, k = 9;
		PermutationSequence permutationSequence = new PermutationSequence();
		System.out.println(permutationSequence.getPermutation(n, k));
	}
}
