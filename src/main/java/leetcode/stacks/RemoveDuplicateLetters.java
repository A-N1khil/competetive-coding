package leetcode.stacks;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateLetters {
	public String removeDuplicateLetters(String s) {
		Map<Character, Integer> lastIndex = new HashMap<>();
		int l = s.length();
		for (int i=0; i<l; i++) {
			lastIndex.put(s.charAt(i), i);
		}

		Deque<Character> stack = new ArrayDeque<>();
		boolean[] visited = new boolean[26];

		for (int i = 0; i < l; i++) {
			char ch = s.charAt(i);

			// Skip if visited, i.e. already in our stack
			if (visited[ch - 'a']) {
				continue;
			}

			if (!stack.isEmpty() && stack.peek() > ch && lastIndex.get(stack.peek()) > i) {
				visited[stack.pop() - 'a'] = false;
			}
			stack.push(ch);
			visited[ch - 'a'] = true;
		}

		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		return sb.reverse().toString();
	}

}
