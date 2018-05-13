package coderbyte.easy.medium;

/**
 * Using the Java language, have the function ThreeSum(arr) take the array of integers stored in arr,
 * and determine if any three distinct numbers (excluding the first element) in the array can sum up to the first element in the array.
 * <p>
 * For example: if arr is [8, 2, 1, 4, 10, 5, -1, -1] then there are actually three sets of triplets that sum to the number 8: [2, 1, 5], [4, 5, -1] and [10, -1, -1]. Your program should return the StringAndArray true if 3 distinct elements sum to the first element, otherwise your program should return the StringAndArray false. The input array will always contain at least 4 elements.
 * <p>
 * Sample Test Cases
 * Input:10, 2, 3, 1, 5, 3, 1, 4, -4, -3, -2
 * Output:"true"
 * <p>
 * Input:12, 3, 1, -5, -4, 7
 * Output:"false"
 * Created by George Fouche on 10/5/17.
 */
public class ThreeSum {
    //TODO find a better way
    public String threeSum(int[] arr) {
        int max = arr[0];
        System.out.println("Max number: " + max);
        String result = "";
        for(int i=1;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if((arr[i]+arr[j]+arr[k]) == max){
                        result += " ["+arr[i]+","+arr[j]+","+arr[k] + "]";
                    }
                }
            }
        }

        if (result.equals("")) {
            return "-1";
        }
        return result;
    }
//TODO convert to unit test
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int [] arr = {10, 2, 3, 1, 5, 3, 1, 4, -4, -3, -2};
        System.out.println(threeSum.threeSum(arr));
    }
}
