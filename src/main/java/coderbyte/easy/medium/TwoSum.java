package coderbyte.easy.medium;

/**
 * Have the function TwoSum(arr) take the array of integers stored in arr, and determine if any
 * two numbers (excluding the first element) in the array can sum up to the first element in the array.
 * For example: if arr is [7, 3, 5, 2, -4, 8, 11], then there are actually two pairs that sum to the number 7: [5, 2] and [-4, 11].
 * Your program should return all pairs, with the numbers separated by a comma, in the order the first number appears in the array. Pairs should be separated by a space. So for the example above, your program would return: 5,2 -4,11
 * <p>
 * If there are no two numbers that sum to the first element in the array, return -1
 * <p>
 * <p>
 * Sample Test Cases
 * Input:17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7
 * Output:6,11 10,7 15,2
 * Input:7, 6, 4, 1, 7, -2, 3, 12
 * Output:6,1 4,3
 * Created by George Fouche on 10/5/17.
 */
public class TwoSum {
    public String twoSum(int[] arr) {
        String result = "";
        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == arr[0]) {
                    result += arr[i] + "," + arr[j] + " ";
                }
            }
        }
        if (result.equals("")) {
            return "-1";
        }
        return result;

    }
//ToDo change to unit tests
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arr = {7,3,5,2,-4,8,11};
        System.out.println(twoSum.twoSum(arr));
    }
}
