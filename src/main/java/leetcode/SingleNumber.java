package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 1;

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, ++count);
                count = 1;
            } else {
                map.put(num, count);
            }
        }

        for (int num : nums) {
            int value = map.get(num);
            if (value == 1) {
                return num;
            }
        }

        return -1;
    }



    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(new leetcode.SingleNumber().singleNumber(nums));
        System.out.println(new leetcode.SingleNumber().singleNumber(new int[]{2,2,1}));

    }
}