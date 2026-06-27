package dp;

public class HouseRobber {
	public int maxAmount(int[] nums) {
		int n = nums.length;
		if (n == 0) {
			return 0;
		}

		int[] dp = new int[n + 1];
		dp[0] = 0; // no house is robbed
		dp[1] = nums[0]; // first house is robbed

		for (int i = 2; i <= n; i++) {
			dp[i] = Math.max(
				nums[i - 1] + dp[i - 2], // Rob this house but have the previous one skipped
				dp[i - 1] // do not rob the house and keep total till last house
			);
		}
		return dp[n];
	}

	public static void main(String[] args) {
		HouseRobber hr = new HouseRobber();
		int[] nums = {2, 7, 9, 3, 1};
		System.out.println(hr.maxAmount(nums)); // Output: 12
	}
}
