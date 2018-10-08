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
        System.out.println(Arrays.toString(mergeArraysExample2(array1,array2)));
    }


    /**
     * Concatenate the two arrays into onem then sort the result
     * @param array1
     * @param array2
     * @return
     */
    private static int[] mergeArraysExample1(int[] array1, int[] array2) {
        int[] mergeArray =Arrays.copyOf(array1,array1.length + array2.length);
        System.arraycopy(array2,0,mergeArray,array1.length,array2.length);
        Arrays.sort(mergeArray);
        return mergeArray;
    }


    private static int[] mergeArraysExample2(int [] array1,int[] array2){
        int [] mergeArray = new int[array1.length + array2.length];

        int currentIndexOfArray1 = 0;
        int currentIndexOfArray2 = 0;
        int currentIndexMerged =0;

        while (currentIndexMerged < mergeArray.length){

            // edge case: array1 is exhausted
            if( currentIndexOfArray1 >= array1.length){
                mergeArray[currentIndexMerged]= array2[currentIndexOfArray2];
            }

            // edge case: array2 is exhausted
            else if(currentIndexOfArray2 >= array2.length){
                mergeArray[currentIndexMerged] =array1[currentIndexOfArray1];
            }

            // case: array1 is next
            else if(array1[currentIndexOfArray1]<array2[currentIndexOfArray2]){
                mergeArray[currentIndexMerged] = array1[currentIndexOfArray1];
                currentIndexOfArray1++;
            }
            // case : array2 is next
            else{
                mergeArray[currentIndexMerged]= array2[currentIndexOfArray2];
                currentIndexOfArray2++;
            }
            currentIndexMerged++;
        }

        return mergeArray;
    }



}
