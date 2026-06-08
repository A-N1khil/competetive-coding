package leetcode.math;

public class FourDivisors {
	public int sumFourDivisors(int[] nums) {
		int divisorSum;
		int divisorCount;
		int totalSum = 0;

		for (int num : nums) {
			int sqr = (int) Math.sqrt(num);
			divisorSum = num + 1; // 1 and num itself
			divisorCount = 2; // 1 and num itself

			for (int i = 2; i <= sqr; i++) {
				if (num % i == 0) {
					// Either i and num/i are same or different
					if (i * i == num) {
						divisorSum += i;
						divisorCount += 1;
					} else {
						divisorSum += i + (num / i);
						divisorCount += 2;
					}
				}
			}
			totalSum += (divisorCount == 4) ? divisorSum : 0;
		}

		return totalSum;
	}

	public static void main(String[] args) {
		int[] nums = {21, 4, 7};
		FourDivisors fd = new FourDivisors();
		System.out.println(fd.sumFourDivisors(nums)); // Output: 32
	}
}
