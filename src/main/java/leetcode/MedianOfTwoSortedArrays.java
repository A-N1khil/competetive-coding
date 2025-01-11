package leetcode;

public class MedianOfTwoSortedArrays {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int n = nums1.length, m = nums2.length;

		// We need to ensure that nums1 is the smaller array because we will be performing binary search on it
		if (n > m) {
			// swap both arrays to ensure that the first is the smaller one
			return findMedianSortedArrays(nums2, nums1);
		}

		// Now that we have ensured that nums1 is the smaller array, we can perform binary search on it
		int low = 0, high = n;


		// Assuming we have joined both the arrays, now, we include more or less elements from the smaller array
		// such that both the partitions have equal number of elements
		// We need to ensure that the left partition has elements less than the right partition
		while (low <= high) {

			// We initialize variables to store the partition sizes of both arrays
			// mid1 will be storing the middle partition of the smaller array
			int mid1 = (low + high) / 2;
			// mid2 will be storing the middle partition of the larger array in such a way that
			// the final left partition always has (n+m+1)/2 elements
			// we subtract mid1 from (n+m+1)/2 to get mid2
			int mid2 = (n + m + 1) / 2 - mid1;

			// calculate l1, r1 => elements to the left and right of mid1
			int l1 = mid1 == 0 ? Integer.MIN_VALUE : nums1[mid1 - 1];
			int r1 = mid1 == n ? Integer.MAX_VALUE : nums1[mid1];

			// calculate l2, r2 => elements to the left and right of mid2
			int l2 = mid2 == 0 ? Integer.MIN_VALUE : nums2[mid2 - 1];
			int r2 = mid2 == m ? Integer.MAX_VALUE : nums2[mid2];

			// If the left partition of the smaller array is less than the right partition of the larger array
			// then l1 needs be lower than r2 and l2 needs to be lower than r1
			if (l1 <= r2 && l2 <= r1) {
				// we have reached the desired mid point of the combined array
				// we need to calculate the median based on the number of elements in the combined array
				return (n + m) % 2 == 0 ? (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0 : Math.max(l1, l2);
			}

			// If the left partition of the smaller array is greater than the right partition of the larger array
			// then we need to move the mid1 to the left so that we can take in fewer elements from the left array
			if (l1 > r2) {
				high = mid1 - 1; // restrict the search space to the left of mid1, decreasing the smaller array
			} else {
				// If the left partition of the smaller array is less than the right partition of the larger array
				// then we need to move the mid1 to the right so that we can take in more elements from the left array
				low = mid1 + 1; // restrict the search space to the right of mid1, increasing the smaller array
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
		System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(new int[] { 1, 3 }, new int[] { 2 })); // 2.0
		System.out.println(medianOfTwoSortedArrays.findMedianSortedArrays(new int[] { 1, 2 }, new int[] { 3, 4 })); // 2.5
	}
}
