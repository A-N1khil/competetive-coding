package leetcode.strings;

public class ReverseString2 {

	String reverseKHelper(String s, int k) {
		// Always check for k > length
		int reverseLength = Math.min(s.length(), k);
		StringBuilder sb = new StringBuilder();
		sb.append(s, 0, reverseLength).reverse();
		if (k <= s.length()) {
			sb.append(s.substring(k));
		}
		return sb.toString();
	}

	public String reverseStr(String s, int k) {
		int index = 0;
		int length = s.length();
		String result = "";
		while (index < length) {
			String subStr = s.substring(index, Math.min(length, index + 2 * k));
			result += reverseKHelper(subStr, k);
			index += 2 * k;
		}
		return result;
	}

	public static void main(String[] args) {
		String s = "abcdefg";
		int k = 2;
		ReverseString2 reverseString2 = new ReverseString2();
//		System.out.println(reverseString2.reverseStr(s, k));
		System.out.println(reverseString2.reverseStr("onetwoten", 3));
		System.out.println(reverseString2.reverseStr("a", 2));
	}
}
