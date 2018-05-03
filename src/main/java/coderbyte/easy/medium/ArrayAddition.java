package coderbyte.easy.medium;

import java.util.Arrays;

/**
 *
 * Have a function that  take the array of numbers stored in arr and return the StringAndArray true if any combination of numbers
 * in the array can be added up to equal the largest number in the array, otherwise return the StringAndArray false.
 *
 * For example: if arr contains [4, 6, 23, 10, 3] the output should return true
 * because 4 + 6 + 10 + 3 = 23.
 *
 * The array will not be empty, will not contain all the same elements, and may contain negative numbers.
 * Created by George Fouche on 10/5/17.
 */
public class ArrayAddition {
    public String addArrayNumbers(int [] arr){
        Arrays.sort(arr);
        int maxNumber = arr[arr.length - 1];
        int sum =0;

        for(int i = 0; i < arr.length-1; i++){
            sum += arr[i];
        }
        return Boolean.toString(sum == maxNumber);

    }

    //Todo change to unit test
    public static void main(String[] args) {
      ArrayAddition arrayAddition = new ArrayAddition();
      int[] array =  {4,6,23,10,3};
        System.out.println(arrayAddition.addArrayNumbers(array));

    }

}
