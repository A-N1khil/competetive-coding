package leetcode;

public class ClearDigits {
	public String clearDigits(String s) {
		StringBuilder answer = new StringBuilder();

		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				answer.setLength(answer.length() - 1);
			} else {
				answer.append(ch);

			}
		}

		return answer.toString();
	}

	public static void main(String[] args) {
		ClearDigits cd = new ClearDigits();
		System.out.println(cd.clearDigits("cb34a"));
	}
}
