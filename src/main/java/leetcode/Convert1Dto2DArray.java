package leetcode;

public class Convert1Dto2DArray {
	public int[][] construct2DArray(int[] original, int m, int n) {
		int[][] answer = new int[m][n];
		if (original.length != m*n) {
			return new int[0][0];
		}

		int row = 0, col = 0;
		for (int i : original) {
			answer[row][col] = i;
			col++;
			if (col == n) {
				row++;
				col = 0;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Convert1Dto2DArray convert1Dto2DArray = new Convert1Dto2DArray();
		int[] original = {1, 2, 3, 4};
		int m = 2, n = 2;
		int[][] answer = convert1Dto2DArray.construct2DArray(original, m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
	}
}
