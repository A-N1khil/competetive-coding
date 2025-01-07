package leetcode;

public class ShortestSubArray {

	public int findLengthOfShortestSubarray(int[] arr) {
		int n = arr.length;
		int left = 0, right = n - 1;

		// increment left pointer until we find a non increasing sequence
		while (left < n-1 && arr[left] <= arr[left+1]) {
			left++;
		}

		// if the array is already sorted, then we cannot extract any array
		if (left == n-1) {
			return 0;
		}

		// decrement right pointer until we find a non increasing sequence
		while (right > 0 && arr[right] >= arr[right-1]) {
			right--;
		}

		// at this point, we consider either the left subarray or the right subarray
		// whichever is smaller
		int minLength = Math.min(n - left - 1, right);

		/*
		* Now we connect both the subarray.
		* We run an index pointer (leftIndex) from 0 till left and a rightIndex from right.
		* Progress the rightIndex until we find elements on the right subarray to be less that the left
		* This way, we maintain the left array, and try to find sequence the right subarray that can be removed
		*/
		for (int leftIndex = 0, rightIndex = right; leftIndex <= left; leftIndex++) {
			// Mind to not increment the rightIndex out of bounds
			if (rightIndex <n && arr[rightIndex] < arr[leftIndex]) {
				rightIndex++;
			}

			// the minimum length to remove would be the difference between both indices
			// i.e the elements between the left and right pointer
			minLength = Math.min(minLength, rightIndex - leftIndex - 1);
		}

		return minLength;
	}
}
