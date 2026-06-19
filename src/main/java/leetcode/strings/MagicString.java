package leetcode.strings;

public class MagicString {
	public int magicalString(int n) {

		if (n < 3) {
			return 1;
		}

		int[] arr = new int[n];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 2;

		int tail = 3; // Index of new insertion
		int head = 2; // Index of current number in question
		int num = 1; // Number to be inserted next
		int oneCount = 1; // Count of 1s

		while (tail < n) {
			for (int i = 0; i < arr[head] && tail < n; i++) {
				// Keep counting one
				if (num == 1) {
					oneCount++;
				}
				arr[tail++] = num;
			}

			// Change num
			num = 3 - num; // Toggles between 1 and 2

			// Move index further
			head++;
		}

		return oneCount;
	}

	public static void main(String[] args) {
		MagicString m = new MagicString();
		System.out.println(m.magicalString(4));
	}
}
