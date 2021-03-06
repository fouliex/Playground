package SpecialCodeProblems;

import java.util.Arrays;

/**
 * Given an array of integers, find the highest product you can get from three of the integers
 * Created by George Fouche on 10/10/17.
 */
public class HighestProductOf3 {


    public int highestProductOf3Example1(int[] arr) {
        Arrays.sort(arr);
        int result = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = arr.length - 1; i >= arr.length - 3; i--) {
            result *= arr[i];
            stringBuilder.append(arr[i] + " ");
        }
        return result;
    }

    /**
     * Keeps track of the highest product of 2 and lowest product of 2(could be a low negative).
     * If the current number times one of those is higher than the current highest product of 3, we have a new highest
     * product of 3.
     * <p>
     * <p>
     * The key here is that we have to deal with negative numbers and that the highest product of 3 could be a result
     * of 2 low negative numbers.
     * <p>
     * <p>
     * <p>
     * A greedy approach is used to solve the problem in one pass. At each iteration we keep track of:
     * highestProductOf3
     * highestProductOf2
     * lowestProductOf2
     * highest
     * lowest
     *
     * @param arr
     * @return
     */
    public int highestProductOf3(int[] arr) {
        /**
         * We are going to start at the 3rd item (at int 2) so we
         * can pre-populate highest and lowest based on the first 2 items.
         *
         * For highestProductOf3 we pre-populate it for the first *3*  items which means in
         * our first pass it will check against itself.
         *
         *
         *
         */
        int highest = Math.max(arr[0], arr[1]);
        int lowest = Math.min(arr[0], arr[1]);

        int highestProductOf2 = arr[0] * arr[1];
        int lowestProductOf2 = arr[0] * arr[1];


        int highestProductOf3 = arr[0] * arr[1] * arr[2];

        for (int i = 2; i < arr.length; i++) {
            int current = arr[i];

            highestProductOf3 = Math.max(
                    Math.max(highestProductOf3, current * highestProductOf2), current * lowestProductOf2);

            // do we have a new highest product of 2?
            highestProductOf2 = Math.max(Math.max(
                    highestProductOf2, current * highest), current * lowest);

            // do we have a new lowest product of 2?
            lowestProductOf2 = Math.min(
                    Math.min(lowestProductOf2, current * highest), current * lowest);

            // do we have a new highest?
            highest = Math.max(highest, current);

            // do we have a new lowest?
            lowest = Math.min(lowest, current);

        }
        return highestProductOf3;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 10, 5, 100};
        HighestProductOf3 highestProductOf3 = new HighestProductOf3();
        System.out.println(highestProductOf3.highestProductOf3(arr));
        System.out.println(highestProductOf3.highestProductOf3Example1(arr));
    }
}
