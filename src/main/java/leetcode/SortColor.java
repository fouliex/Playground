package leetcode;

import java.util.Arrays;

/**
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are
 * adjacent with the colors in the order red, white and blue.
 * <p>
 * Here we'll use the integers 0, 1 and 2 to represent the color red, white and blue respectively
 * <p>
 * Note: you can use sorting libaries
 */
public class SortColor {

    public int[] sortColors(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int j = i;
            int toInsert = nums[i];
            while ((j > 0) && (nums[j - 1] > toInsert)) {
                nums[j] = nums[j - 1];
                j--;
            }
            nums[j] = toInsert;
        }

        return nums;
    }

    public static void main(String[] args) {

        int[] array = {2,0,1,1,1,0};
        System.out.println(Arrays.toString(new SortColor().sortColors(array)));

    }

}
