package leetcode.dp;

import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {

	public void generateTriangle(int current, int num, List<Integer> triangle, List<List<Integer>> result) {

		if (current == num) {
			triangle.add(1);
			result.add(triangle);
			return;
		}

		if (current == 1) {
			triangle.add(1);
			generateTriangle(current + 1, num, triangle, result);
			return;
		}

		triangle.add(result.get(num - 2).get(current - 1) + result.get(num - 2).get(current - 2));
		generateTriangle(current + 1, num, triangle, result);
	}


	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new LinkedList<>();
		for (int i = 1; i <= numRows; i++) {
			List<Integer> triangle = new LinkedList<>();
			generateTriangle(1, i, triangle, result);
			System.out.println(result);
		}
		return result;
	}

	public List<List<Integer>> generateOptimised(int numRows) {

		if (numRows == 0) {
			return new LinkedList<>();
		}

		if (numRows == 1) {
			return List.of(List.of(1));
		}

		// Generate the previous rows
		List<List<Integer>> result = generate(numRows - 1);
		List<Integer> newRow = new LinkedList<>();

		for (int i =1; i<= numRows; i++) {
			if (i == 1 || i == numRows) {
				newRow.add(1);
			} else {
				newRow.add(result.get(numRows - 2).get(i - 1) + result.get(numRows - 2).get(i - 2));
			}
		}

		result.add(newRow);
		return result;
	}

	public static void main(String[] args) {
		PascalTriangle pt = new PascalTriangle();
		System.out.println(pt.generateOptimised(5));
	}
}
