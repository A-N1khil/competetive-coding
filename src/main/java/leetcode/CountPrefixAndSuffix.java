package leetcode;

public class CountPrefixAndSuffix {
	public boolean isPrefixAndSuffix(String str1, String str2) {
		int s1 = str1.length(), s2 = str2.length();
		if (s1 > s2) {
			return false;
		}
		for (int i = 0; i < s1; i++) {
			if ((str2.charAt(i) != str1.charAt(i))
				|| (str2.charAt(s2 - 1 - i) != str1.charAt(s1 - 1 - i))) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String str1 = "aba", str2 = "ababa";
		CountPrefixAndSuffix countPrefixAndSuffix = new CountPrefixAndSuffix();
		System.out.println(countPrefixAndSuffix.isPrefixAndSuffix(str1, str2));
	}
}
