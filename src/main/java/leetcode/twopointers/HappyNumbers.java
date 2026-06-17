package leetcode.twopointers;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/happy-number">Happy Number</a>
 */
public class HappyNumbers {

	int squareSum(int n) {
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			sum += digit * digit;
			n /= 10;
		}
		return sum;
	}

	public boolean isHappy_set(int n) {
		Set<Integer> visited = new HashSet<>();

		while (n > 9 && !visited.contains(n)) {
			visited.add(n);
			n = squareSum(n);
		}

		return n == 1 || n == 7;
	}

	public boolean isHappyTwoPointers(int n) {

		int slow = n, fast = n;
		do {
			slow = squareSum(slow);
			fast = squareSum(squareSum(fast));
		} while (slow != fast && fast != 1);
		return fast == 1;
	}

	public boolean isHappyRecursive(int n) {
		if (n == 1 || n == 7) {
			return true;
		} else if (n < 10) {
			return false;
		} else {
			int sum = squareSum(n);
			return isHappyRecursive(sum);
		}
	}
}
