package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				if (i - map.get(nums[i]) <= k) {
					return true;
				}
			}
			map.put(nums[i], i);
		}
		return false;
	}

	public static void main(String[] args) {
		ContainsDuplicate2 cd = new ContainsDuplicate2();
		int[] nums = {1, 2, 3, 1};
		int k = 3;
		System.out.println(cd.containsNearbyDuplicate(nums, k)); // Output: true

		int[] nums2 = {1, 2, 3, 1, 2, 3};
		int k2 = 2;
		System.out.println(cd.containsNearbyDuplicate(nums2, k2)); // Output: false
	}

}
