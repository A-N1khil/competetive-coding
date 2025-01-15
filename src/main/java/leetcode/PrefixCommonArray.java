package leetcode;

public class PrefixCommonArray {
	public int[] findThePrefixCommonArray(int[] A, int[] B) {

		// both arrays are set to have the same length
		int n = A.length;

		int[] ans = new int[n];

		// Will keep the frequency of the elements in the arrays (1-indexed)
		int[] countA = new int[n + 1];
		int[] countB = new int[n + 1];

		for (int i = 0; i < n; i++) {
			countA[A[i]]++;
			countB[B[i]]++;

			// now we check the common elements by running from 1 till n
			// since 0 index will have no common elements
			for (int j = 1; j <= n; j++) {
				ans[i] += Math.min(countA[j], countB[j]);
			}
		}
		return ans;
	}

	public int[] findThePrefixCommonArrayOneLoop(int[] A, int[] B) {

		// both arrays are set to have the same length
		int n = A.length;

		int[] ans = new int[n];

		// Will keep the frequency of the elements in the arrays (1-indexed)
		int[] count = new int[n + 1];
		int counter = 0; // this will keep the running sum going on
		for (int i = 0; i < n; i++) {
			count[A[i]]++;
			if (count[A[i]] == 2) {
				// this element has already occurred in the array before
				counter++;
			}
			count[B[i]]++;
			if (count[B[i]] == 2) {
				// this element has already occurred in the array before
				counter++;
			}
			ans[i] = counter;
		}
		return ans;
	}
}
