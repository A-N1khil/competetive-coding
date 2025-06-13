package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstCompletelyPaintedRow {
	public int firstCompleteIndex(int[] arr, int[][] mat) {
		int runningIndex = 0;
		Map<Integer, Integer> posMap = new LinkedHashMap<>();

		// We create a position map of all the entries of the matrix assigned a running index, 0 onwards
		for (int[] row : mat) {
			for (int colValue : row) {
				posMap.put(colValue, runningIndex++);
			}
		}

		// Number of rows and columns
		int n = mat[0].length, m = mat.length;
		int[] rowFreq = new int[m];
		int[] colFreq = new int[n];

		for (int i=0; i<arr.length; i++) {

			// We first get the index
			int index = posMap.get(arr[i]);

			// Row = index / n
			int row = index / n;

			// Increment the row count
			rowFreq[row]++;

			// Check if we are fully painted
			if (rowFreq[row] == n) {
				return i;
			}

			// Column = index % n
			int col = index % n;

			// Increment column frequency
			colFreq[col]++;

			// Check if we are fully painted
			if (colFreq[col] == m) {
				return i;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		FirstCompletelyPaintedRow firstCompletelyPaintedRow = new FirstCompletelyPaintedRow();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		firstCompletelyPaintedRow.firstCompleteIndex(arr, mat);
	}
}
