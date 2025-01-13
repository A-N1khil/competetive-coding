package leetcode;

public class ParenthesisStringIsValid {
	public boolean canBeValid(String s, String locked) {
		int n = s.length();

		// odd length string can never be matched
		if (n % 2 == 1) return false;

		int balance = 0;

		// Fist we scan from left to right for open parenthesis or characters that can be flipped to open
		// parenthesis or both
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '(' || locked.charAt(i) == '0') {
				// we have encountered an open parenthesis or a flippable character
				balance++;
			} else if (balance > 0) {
				// we have come across a close parenthesis, which cannot be flipped
				// we need to reduce the balance, and return false is it is negative
				balance--;
			} else {
				// closed parenthesis + not a flippable character and the balance is negative
				return false;
			}
		}

		balance = 0;

		// Now we scan from right to left for closed parenthesis or characters that can be flipped to closed
		for (int i = n - 1; i >= 0; i--) {
			if (s.charAt(i) == ')' || locked.charAt(i) == '0') {
				// we have encountered a closed parenthesis or a flippable character
				balance++;
			} else if (balance > 0) {
				// we have come across an open parenthesis, which cannot be flipped
				// we need to reduce the balance, and return false is it is negative
				balance--;
			} else {
				// open parenthesis + not a flippable character and the balance is negative
				return false;
			}
		}

		return true;
	}

	public boolean canBeValidOnePass(String s, String locked) {

		int n = s.length();
		if ((n & 1) == 1) return false;
		int minBal = 0, maxBal = 0;

		// Here we are using the approach of having two balances.
		// One for the minimum balance and one for the maximum balance
		// We increment both the balances when we encounter an open parenthesis and decrease both the balances
		// when we encounter a closed parenthesis.
		// However, when we find a flippable character, we only increment the maximum balance and decrement the minimum balance
		// This is because we can flip the flippable character to either open or closed parenthesis
		for (int i = 0; i < n; i++) {
			if (locked.charAt(i) == '0') {
				minBal--;
				maxBal++;
			} else {
				if (s.charAt(i) == '(') {
					minBal++;
					maxBal++;
				} else {
					minBal--;
					maxBal--;
				}
			}
			if (maxBal < 0) return false;
			minBal = Math.max(0, minBal);
		}

		return minBal == 0;
	}

	public static void main(String[] args) {
		ParenthesisStringIsValid psv = new ParenthesisStringIsValid();
		System.out.println(psv.canBeValid("())", "001")); // false
		System.out.println(psv.canBeValid("()", "00")); // true
		System.out.println(psv.canBeValid("))()))", "010100")); // true
		System.out.println(psv.canBeValidOnePass("())", "001")); // false
		System.out.println(psv.canBeValidOnePass("()", "00")); // true
		System.out.println(psv.canBeValidOnePass("))()))", "010100")); // true
	}
}
