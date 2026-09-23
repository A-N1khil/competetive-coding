package leetcode.stacks;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Stack<Integer> stack = new Stack<>();
		int[] res = new int[nums1.length];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = nums2.length - 1; i >= 0; i--) {
			int num = nums2[i];
			while (!stack.isEmpty() && stack.peek() < num) {
				stack.pop();
			}
			if (!stack.isEmpty()) {
				map.put(num, stack.peek());
			}
			stack.push(num);
		}
		for (int i = 0; i < nums1.length; i++) {
			res[i] = map.getOrDefault(nums1[i], -1);
		}
		return res;
	}

	public static void main(String[] args) {
		NextGreaterElement1 nge = new NextGreaterElement1();
		int[] nums1 = {4, 1, 2};
		int[] nums2 = {1, 3, 4, 2};
		int[] result = nge.nextGreaterElement(nums1, nums2);
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
