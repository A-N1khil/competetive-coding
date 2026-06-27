package leetcode.dp;

public class MaximalSquare {
	public int maximalSquare(char[][] matrix) {
		int rows = matrix.length, cols = matrix[0].length;
		int[][] dp = new int[rows + 1][cols + 1];
		int maxSquare = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// We only check for those cells who have 1 present
				if (matrix[i][j] == '1') {
					// Min length accumulated from cell above, left and top left, then add 1
					dp[i + 1][j + 1] = Math.min(Math.min(dp[i][j + 1], dp[i][j]), dp[i + 1][j]) + 1;
					maxSquare = Math.max(maxSquare, dp[i + 1][j + 1]);
				}
			}
		}
		return maxSquare * maxSquare;
	}
}
