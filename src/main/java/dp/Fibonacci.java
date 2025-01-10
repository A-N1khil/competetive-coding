package dp;

public class Fibonacci {
	public int fibonacci(int n, int[] memo) {
		if (memo[n] != 0) {
			return memo[n];
		}
		if (n <= 2) return 1;
		memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
		return memo[n];
	}

	public static void main(String[] args) {
		int n = 25;
		int[] memo = new int[n + 1];
		System.out.println(new Fibonacci().fibonacci(n, memo));
	}
}
