package leetcode.dp;

public class UniquePaths2 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int m = obstacleGrid.length, n = obstacleGrid[0].length;
		int[][] dp = new int[m][n];

		// fill in the top row and the left column with 1s as there are only one way to reach them
		for (int i = 0; i < m; i++) {
			if (obstacleGrid[i][0] == 1) {
				// we have encountered an obstacle, so going further will not be possible
				break;
			}
			// all grids before the obstacle can not be initialized
			dp[i][0] = 1;
		}

		for (int i = 0; i < n; i++) {
			if (obstacleGrid[0][i] == 1) {
				// we have encountered an obstacle, so going further will not be possible
				break;
			}
			// all grids before the obstacle can not be initialized
			dp[0][i] = 1;
		}

		// Now that we have everything set, we need to compute the number of ways to reach the current cell
		// But, if we encounter an obstacle, we have to set the current cell as 0
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (obstacleGrid[i][j] == 1) {
					dp[i][j] = 0;
				} else {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}
			}
		}

		return dp[m - 1][n - 1];
	}
}
