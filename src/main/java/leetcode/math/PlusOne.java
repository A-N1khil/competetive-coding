package leetcode.math;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int[] result = new int[digits.length + 1];
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int sum = digits[i] + carry;
			if (sum >= 10) {
				carry = 1;
				digits[i] = sum % 10;
				result[i] = sum % 10;
			} else {
				digits[i] = sum;
				result[i] = sum;
				carry = 0;
			}
		}

		if (carry == 1) {
			result[0] = 1;
			return result;
		} else {
			return digits;
		}
	}

	public static void main(String[] args) {
		PlusOne po = new PlusOne();
		int[] digits = {1, 2, 9};
		int[] result = po.plusOne(digits);
		for (int digit : result) {
			System.out.print(digit + " ");
		}
	}
}
