package dp;

public class CatalanNumbers {
	public long binomialCoefficient(int n, int k) {
		long res = 1;

		// Since C(n, k) = C(n, n-k)
		if (k > n - k)
			k = n - k;

		// Calculate value of [n*(n-1)*---*(n-k+1)] /
		// [k*(k-1)*---*1]
		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}

		return res;
	}

	public long catalanNumber(int n) {
		long c = binomialCoefficient(2 * n, n);
		return c / (n + 1);
	}
}
