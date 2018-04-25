package leetcode;

/**
 * Given an integer array nums, find the contiguous subarray(containing at least one number) which has the largest
 * sum and return its sum
 */
public class MaximumSubarray {
        public int maxSubArray(int[] nums){
            int maxEnd=0;
             int maxSoFar = 0;
            for(int i = 0; i< nums.length;i++){
               maxEnd = maxEnd + nums[i];
                if (maxEnd <0){
                    maxEnd =0;
                }
               if(maxSoFar < maxEnd){
                   maxSoFar = maxEnd;
               }

            }
            return maxSoFar;
        }


    public static void main(String[] args) {

    }
}
