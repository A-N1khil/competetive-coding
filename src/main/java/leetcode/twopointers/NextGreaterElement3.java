package leetcode.twopointers;

public class NextGreaterElement3 {

	/**
	 * Swap the characters at the given indices
	 */
	void swap(char[] digits, int swapIndex, int pivotIndex) {
		char temp = digits[swapIndex];
		digits[swapIndex] = digits[pivotIndex];
		digits[pivotIndex] = temp;
	}

	/**
	 * Reverse the array using two pointer approach
	 */
	void reverse(char[] digits, int start, int end) {
		while (start < end) {
			swap(digits, start, end);
			start++;
			end--;
		}
	}

	public int nextGreaterElement(int n) {
		if (n < 12) {
			return -1;
		}

		char[] digits = String.valueOf(n).toCharArray();
		int length = digits.length;
		int pivotIndex = length - 2;
		while (pivotIndex >= 0 && digits[pivotIndex] >= digits[pivotIndex + 1]) {
			pivotIndex--;
		}

		if (pivotIndex < 0) {
			return -1;
		}

		int swapIndex = length - 1;
		while (digits[swapIndex] >= digits[pivotIndex]) {
			swapIndex--;
		}

		swap(digits, swapIndex, pivotIndex);

		// Reverse everything after the pivot
		reverse(digits, pivotIndex + 1, length - 1);

		long answer = Long.parseLong(new String(digits));
		return answer > Integer.MAX_VALUE ? -1 : (int) answer;
	}


	public static void main(String[] args) {
		NextGreaterElement3 nextGreaterElement3 = new NextGreaterElement3();
		System.out.println(nextGreaterElement3.nextGreaterElement(12543));
	}
}
