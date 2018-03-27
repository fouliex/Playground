package dynamicprogramming;

/**
 * You are a professional robber planning to rob houses along a street.
 * Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that
 * adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class HouseRobber {
    // num is the amount of money stashed at each houses
    int rob(int i, int[] nums) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return nums[0];
        }
        int max = -1;
        max = Math.max(max, rob(i - 1, nums)); // Don't steal from the house (R[i-1])

        //Steal from the house
        for (int j = i - 2; j >= 0; --j) {
            max = Math.max(max, rob(j, nums) + nums[i - 1]);
        }                        // R[j+
        return max;
    }

    int rob2(int n, int[] nums) {
        int[] R = new int[n];
        R[0] = nums[0];
        R[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; ++i) {
            R[i] = R[i - 1];
            for (int j = i - 2; j >= 0; --j) {
                R[i] = Math.max(R[i], R[j] + nums[i]);
            }
        }

        return R[n-1];

    }

    int rob3(int n, int[] nums) {
        int[] R = new int[n];
        R[0] = nums[0];
        R[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n; ++i) {
            R[i] = Math.max(R[i - 1], R[i - 2] + nums[i]);
        }

        return R[n - 1];
    }

    public int rob4(int[] num) {
        int prevMax = 0;
        int currMax = 0;
        for (int x : num) {
            int temp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;
    }

    public static void main(String[] args) {
        // Most money we can steal is  1+3+5
        int[] numbers = {1, 2, 3, 4, 5,6,7,8};
        HouseRobber houseRobber = new HouseRobber();
        System.out.println(houseRobber.rob(8, numbers));
        System.out.println(houseRobber.rob2(8, numbers));
        System.out.println(houseRobber.rob3(8, numbers));
        System.out.println(houseRobber.rob4( numbers));

    }
}
