package recursion;

public class Fibonacci {

	public int fibonacci(int n) {
		if (n <= 2) return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(new Fibonacci().fibonacci(50 ));
	}
}
