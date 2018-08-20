package interviewCake.arrayAndSprintManipulation;

import java.util.Arrays;

/**
 * Write a method to merge 2 arrays into one sorted array
 */
public class MergeSortedArrays {


    public static void main(String[] args) {
        int [] array1 = new int[] {3,4,6,10,11,15};
        int[] array2 = new int[]{1,5,8,12,14,19};


        System.out.println(Arrays.toString(mergeArraysExample1(array1,array2)));
    }

    private static int[] mergeArraysExample1(int[] array1, int[] array2) {
        int[] mergeArray =Arrays.copyOf(array1,array1.length + array2.length);
        System.arraycopy(array2,0,mergeArray,array1.length,array2.length);
        Arrays.sort(mergeArray);
        return mergeArray;
    }



}
