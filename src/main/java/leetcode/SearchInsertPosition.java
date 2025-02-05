package leetcode;

public class SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {

		int low = 0, high = nums.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			if (nums[mid] == target) {
				return mid;
			}

			if (target < nums[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return mid;
	}
}
