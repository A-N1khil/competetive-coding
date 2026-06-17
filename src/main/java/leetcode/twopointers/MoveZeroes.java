package leetcode.twopointers;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/move-zeroes">Move Zeroes</a>
 */
public class MoveZeroes {

	public void moveZeroes(int[] nums) {
		int nonZeroIndex = 0;
		for (int i = 0; i< nums.length; i++) {
			// Shift non zero numbers ahead
			if (nums[i] != 0) {
				int temp = nums[nonZeroIndex];
				nums[nonZeroIndex] = nums[i];
				nums[i] = temp;

				// Filled a place
				nonZeroIndex++;
			}
			// For the other case, if nums[i] == 0, => the space is available for the next
			// non-zero number
		}
	}

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 3, 12};
		MoveZeroes mz = new MoveZeroes();
		mz.moveZeroes(arr);
		System.out.println(Arrays.stream(arr).boxed().toList());
	}
}
