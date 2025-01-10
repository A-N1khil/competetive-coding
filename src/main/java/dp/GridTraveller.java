package dp;

public class GridTraveller {

	public int gridTraveller(int m, int n, int[][] grid) {
		if (m == 1 && n == 1) {
			return 1;
		}
		// Not possible to move
		if (m == 0 || n == 0) {
			return 0;
		}
		if (grid[m][n] != 0) {
			return grid[m][n];
		}
		grid[m][n] = gridTraveller(m - 1, n, grid) + gridTraveller(m, n - 1, grid);
		return grid[m][n];
	}

	public static void main(String[] args) {
		int m = 15, n = 15;
		int[][] grid = new int[m + 1][n + 1];
		System.out.println(new GridTraveller().gridTraveller(m, n, grid));
	}
}
