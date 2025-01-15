package leetcode;

public class MinimizeXOR {
	public int minimizeXor(int num1, int num2) {
		/*
		 * set bits are the number of 1s in the binary representation
		 * If we find a number that has the same number of set bits as num2, by incrementing num1 by 1
		 * we will get the minimum XOR value
		 */

		int count1 = Integer.bitCount(num1);
		int count2 = Integer.bitCount(num2);

		// Is the number of set bits in num1 less than that of num2?
		// Increase the number of set bits in num1
		while (count1 < count2) {
			num1 |= num1 + 1;
			++count1;
		}

		// Is the number of set bits in num1 greater than that of num2?
		// Decrease the number of set bits in num1
		while (count1 > count2) {
			num1 &= num1 - 1;
			++count1;
		}

		return num1;
	}

	public static void main(String[] args) {
		MinimizeXOR minimizeXOR = new MinimizeXOR();
//		System.out.println(minimizeXOR.minimizeXor(1, 12)); // 3
		System.out.println(minimizeXOR.minimizeXor(3, 5)); // 3

	}
}
