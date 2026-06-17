package leetcode.twopointers;

public class ReverseVowelsInString {

	public String reverseVowels(String s) {

		boolean[] vowels = new boolean[128];
		for (char c : "aeiouAEIOU".toCharArray()) {
			vowels[c] = true;
		}

		char[] chars = s.toCharArray();
		int left = 0, right = s.length() - 1;
		while (left < right) {
			// Move left until a vowel is found
			while (left < right && !vowels[chars[left]]) {
				left++;
			}
			// Move right until a vowel is found
			while (left < right && !vowels[chars[right]]) {
				right--;
			}
			// If they haven't crossed and found a vowel, swap
			if (left < right) {
				char temp = chars[left];
				chars[left] = chars[right];
				chars[right] = temp;

				left++;
				right--;
			}
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		String str = "IceCreAm";
		ReverseVowelsInString reverse = new ReverseVowelsInString();
		System.out.println(reverse.reverseVowels(str));
	}
}
