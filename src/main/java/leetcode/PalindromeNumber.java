package leetcode;

public class PalindromeNumber {

	public boolean isPalindrome(int n) {

		// negative numbers cannot be boolean
		if (n < 0) {
			return false;
		}

		long newNumber = 0L;
		int temp = n, rem;
		while (temp > 0) {
			rem = temp % 10;
			newNumber = newNumber * 10 + rem;
			temp /= 10;
		}

		return newNumber == n;
	}

	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		System.out.println(palindromeNumber.isPalindrome(121)); // true
		System.out.println(palindromeNumber.isPalindrome(-121)); // false
		System.out.println(palindromeNumber.isPalindrome(10)); // false
	}
}
