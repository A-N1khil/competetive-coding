package leetcode.dp;

public class UglyNumber2 {
	public int nthUglyNumber(int n) {
		int[] dp = new int[n];
		int i2 = 0, i3 = 0, i5 = 0;
		dp[0] = 1;
		for (int i = 1; i < n; i++) {
			int n2 = dp[i2] * 2;
			int n3 = dp[i3] * 3;
			int n5 = dp[i5] * 5;
			int nextUgly = Math.min(n2, Math.min(n3, n5));
			dp[i] = nextUgly;

			if (nextUgly == n2) {
				i2++;
			}

			if (nextUgly == n3) {
				i3++;
			}

			if (nextUgly == n5) {
				i5++;
			}
		}
		return dp[n - 1];
	}

	public static void main(String[] args) {
		UglyNumber2 uglyNumber2 = new UglyNumber2();
		int n = 10;
		System.out.println(uglyNumber2.nthUglyNumber(n)); // Output: 12

		n = 4;
		System.out.println(uglyNumber2.nthUglyNumber(n));
	}
}
