package leetcode;

public class NeighboringBitwiseXOR {
	public boolean doesValidArrayExist(int[] derived) {
		int xorSum = 0;

		/*
		 The XOR of an element with itself is 0
		 So, if the XOR of all elements is 0, then we can always find a valid array
		 Reason: In the original array, the XOR is computed with the neighboring element to form the derived array
		 Thus, if we XOR all the elements of the derived array, then all the elements of the original array would be
		 XORed with itself, thus ending up as 0
		*/

		for (int element : derived) {
			xorSum ^= element;
		}

		return xorSum == 0;
	}
}
