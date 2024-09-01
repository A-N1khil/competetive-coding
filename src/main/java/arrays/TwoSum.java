package arrays;

import java.util.Collections;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int x;
        for (int i=0; i<arr.length; i++) {
            x = target - arr[i];
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            } else {
                map.put(arr[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = new TwoSum().twoSum(arr, target);
        System.out.println(Collections.singletonList(result));
    }
}
