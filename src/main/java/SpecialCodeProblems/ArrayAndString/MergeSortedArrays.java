package SpecialCodeProblems.ArrayAndString;

import java.util.Arrays;

/**
 * In order to win the price for most cookies sold, my friend Alice and i are going to merge our Girl Scout Cookies orders
 * and enter as one unit.
 * <p>
 * Each order is represented by an "order id" (an integer).
 * <p>
 * We have our list of orders sorted numerically already, in arrays. Write a function to merge our arrays of orders into
 * one sorted array.
 * Created by fouli on 10/16/2017.
 */
public class MergeSortedArrays {
    public static int[] mergeArraysExample1(int[] firstArray, int[] secondArrays) {
        int[] mergeArray = Arrays.copyOf(firstArray, firstArray.length + secondArrays.length);

        int[] sourceArray = secondArrays;
        int sourceArrayPosition = 0;
        int[] destinationArray = mergeArray;
        int destinationArrayPos = firstArray.length;
        int numberOfArrayElementsToBeCopied = secondArrays.length;
        System.arraycopy(sourceArray, sourceArrayPosition, destinationArray, destinationArrayPos, numberOfArrayElementsToBeCopied);
        Arrays.sort(destinationArray);
        return destinationArray;
    }


    public static int[] mergeArraysExample2(int[] firstArray, int[] secondArrays) {
        int[] mergedArray = new int[firstArray.length + secondArrays.length];

        int currentIndexOfSecondArray = 0;
        int currentIndexOfFirstArray = 0;
        int currentIndexMerged = 0;

        while (currentIndexMerged < mergedArray.length) {

            if (currentIndexOfFirstArray >= firstArray.length) {
                mergedArray[currentIndexMerged] = secondArrays[currentIndexOfSecondArray];
                currentIndexOfSecondArray++;
            } else if (currentIndexOfSecondArray >= secondArrays.length) {
                mergedArray[currentIndexMerged] = firstArray[currentIndexOfFirstArray];
                currentIndexOfFirstArray++;
            } else if (firstArray[currentIndexOfFirstArray] < secondArrays[currentIndexOfSecondArray]) {
                mergedArray[currentIndexMerged] = firstArray[currentIndexOfFirstArray];
                currentIndexOfFirstArray++;
            } else {
                mergedArray[currentIndexMerged] = secondArrays[currentIndexOfSecondArray];
                currentIndexOfSecondArray++;
            }
            currentIndexMerged++;
        }
        return mergedArray;
    }

    public static void main(String[] args) {
        int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
        int[] alicesArray = new int[]{1, 5, 8, 12, 14, 19};
        System.out.println(Arrays.toString(mergeArraysExample1(myArray, alicesArray)));
        System.out.println(Arrays.toString(mergeArraysExample2(myArray, alicesArray)));
    }


}

