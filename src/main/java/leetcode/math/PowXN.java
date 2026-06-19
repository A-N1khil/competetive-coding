package leetcode.math;

public class PowXN {
	public double myPow(double x, int n) {
		if (x == 0 || x == 1) {
			return x;
		}
		if (n == 0) {
			return 1;
		}
		if (x == -1) {
			return n % 2 == 0 ? 1 : -1;
		}
		return n < 0 ? (1 / pow(x, -(long) n)) : pow(x, n);
	}

	double pow(double base, long exponent) {
		double result = 1.0;
		while (exponent > 0) {
			if ((exponent & 1) == 1) {
				result *= base;
			}
			base *=  base;
			exponent >>= 1;
		}
		return result;
	}
}
