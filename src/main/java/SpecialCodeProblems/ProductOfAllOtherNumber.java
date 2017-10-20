package SpecialCodeProblems;

import java.util.Arrays;

/**
 * Write a function getProductsOfAllIntsExceptAtIndex() that takes an array of integers and returns an array of the
 * products.
 * <p>
 * For example, given:
 * [1,7,3,4]
 * should return:
 * [84,12,28,21]
 * <p>
 * by calculating:
 * [7 * 3 * 4,  1 * 3 * 4,  1 * 7 * 4,  1 * 7 * 3]
 * <p>
 * <p>
 * Created by George Fouche on 10/8/17.
 */
public class ProductOfAllOtherNumber {

    public int[] getProductsOfAllIntsExceptAtIndexExample1(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = 1;
            for (int y = 0; y < arr.length; y++) {
                if (i != y) {
                    result[i] *= arr[y];
                }
            }
        }
        return result;
    }

    public int[] getProductsOfAllIntsExceptAtIndexExample2(int[] arr) {
        int[] productsOfAllIntsBeforeIndex = new int[arr.length];
        int productSoFar = 1;

        for (int i = 0; i < arr.length; i++) {
            productsOfAllIntsBeforeIndex[i] = productSoFar;
            productSoFar *= arr[i];
        }

        int[] productsOfAllIntsAfterIndex = new int[arr.length];
        productSoFar = 1;

        for (int j = arr.length - 1; j >= 0; j--) {
            productsOfAllIntsAfterIndex[j] = productSoFar;
            productSoFar *= arr[j];
        }

        int[] productsOfAllInts = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            productsOfAllInts[k] = productsOfAllIntsBeforeIndex[k] * productsOfAllIntsAfterIndex[k];
        }

        return productsOfAllInts;

    }

    public int[] getProductsOfAllIntsExceptAtIndexExample3(int[] arr) {
        int[] productsOfAllIntsExceptAtIndex = new int[arr.length];
        int productSoFar = 1;

        for (int i = 0; i < arr.length; i++) {
            productsOfAllIntsExceptAtIndex[i] = productSoFar;
            productSoFar *= arr[i];
        }

        productSoFar = 1;
        for (int j = arr.length - 1; j >= 0; j--) {
            productsOfAllIntsExceptAtIndex[j] *= productSoFar;
            productSoFar *= arr[j];
        }


        return productsOfAllIntsExceptAtIndex;
    }

    public static void main(String[] args) {
        ProductOfAllOtherNumber productOfAllOtherNumber = new ProductOfAllOtherNumber();
        int[] arr = {1, 7, 3, 4};
        System.out.println(Arrays.toString(productOfAllOtherNumber.getProductsOfAllIntsExceptAtIndexExample1(arr)));
        System.out.println(Arrays.toString(productOfAllOtherNumber.getProductsOfAllIntsExceptAtIndexExample2(arr)));
        System.out.println(Arrays.toString(productOfAllOtherNumber.getProductsOfAllIntsExceptAtIndexExample3(arr)));
    }
}
