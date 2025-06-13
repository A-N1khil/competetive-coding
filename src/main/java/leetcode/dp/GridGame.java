package leetcode.dp;

public class GridGame {
	public long gridGame(int[][] grid) {

		// Initialize the lengths
		int n = grid[0].length;

		/*
		* We will first consider that the first robot moves down at the fist column and stays on the bottom row
		* Thus, the second robot will move right at the first column and stay on the top row
		 */
		long sumTop = 0, sumBottom = 0, ans = Long.MAX_VALUE;
		for (int val : grid[0]) {
			sumTop += val;
		}

		// Thus we have considered the first robot moving down at the first column and staying on the bottom row
		// Now we consider the possibility that the first robot stays on the top row
		for (int i=0; i<n; i++) {

			// Assuming that the first robot stays on the top row, we need to consider the second robot moving down
			// Hence we subtract the value of the top row from the existing value of the top row sum
			sumTop -= grid[0][i];

			// Since the job of the first robot is to minimize the points collected by the second, assuming it stays on
			// the optimal path, we need to consider the minimum value of the maximum possible sum the second robot can
			// collect
			ans = Math.min(ans, Math.max(sumTop, sumBottom));

			// Now that we have considered the first robot moving right, the second robot has no choice but to move
			// bottom to maximise its points
			sumBottom += grid[1][i];
		}

		return ans;
	}
}
