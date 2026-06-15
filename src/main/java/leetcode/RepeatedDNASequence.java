package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RepeatedDNASequence {
	public List<String> findRepeatedDnaSequences(String s) {

		// Answer List
		List<String> result = new LinkedList<>();

		// Corner case - Empty String
		if (s.length() < 10) {
			return result;
		}

		Map<String, Integer> map = new HashMap<>();
		Set<String> set = new HashSet<>();

		for (int i = 0; i <= s.length() - 10; i++) {
			String window = s.substring(i, i + 10);
			if (!set.add(window)) {
				result.add(window);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		RepeatedDNASequence rds = new RepeatedDNASequence();
		String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
		List<String> result = rds.findRepeatedDnaSequences(s);
		for (String str : result) {
			System.out.println(str);
		}
	}
}
