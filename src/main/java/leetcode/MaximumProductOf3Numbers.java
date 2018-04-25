package leetcode;

import java.util.Arrays;

public class MaximumProductOf3Numbers {
         public int maximumProduct(int [] nums){
             Arrays.sort(nums);
             int firstTwoNumbersAndLastNumber =  nums[0] * nums[1] * nums[nums.length -1];
             int lastThreeNumbers = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
             return Math.max(firstTwoNumbersAndLastNumber,lastThreeNumbers);
         }

}
