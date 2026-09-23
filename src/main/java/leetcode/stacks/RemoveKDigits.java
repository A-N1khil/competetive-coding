package leetcode.stacks;

public class RemoveKDigits {
	public String removeKDigits(String num, int k) {
		StringBuilder sb = new StringBuilder();
		for (char ch : num.toCharArray()) {
			while (!sb.isEmpty() && sb.charAt(sb.length() - 1) > ch && k > 0) {
				sb.deleteCharAt(sb.length() - 1);
				k--;
			}
			sb.append(ch);
		}
		String result = sb.substring(0, sb.length() - k);
		int index = 0;
		while (index < sb.length() && sb.charAt(index) == '0') {
			index++;
		}
		return index == sb.length() ? "0" : sb.substring(index);
	}
}
