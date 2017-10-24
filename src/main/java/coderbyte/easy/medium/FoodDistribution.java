package coderbyte.easy.medium;

import java.util.Arrays;

/**
 * Have the function foodDistribution(arr) read the array of numbers stored in arr which will represent the hunger level
 * of different people ranging from 0 to 5 (0 meaning not hungry at all, 5 meaning very hungry).
 * <p>
 * You will also have N sandwiches to give out which will range from 1 to 20. The format of the array will be [N, h1, h2, h3, ...]
 * where N represents the number of sandwiches you have and the rest of the array will represent the hunger levels of different people.
 * Your goal is to minimize the hunger difference between each pair of people in the array using the sandwiches you have available.
 * <p>
 * <p>
 * For example: if arr is [5, 3, 1, 2, 1], this means you have 5 sandwiches to give out.
 * You can distribute them in the
 * following order to the people: 2, 0, 1, 0.
 *
 * Giving these sandwiches to the people their hunger levels now become: [1, 1, 1, 1].
 * The difference between each pair of people is now 0, the total is also 0, so your program should return 0.
 * <p>
 * Note: You may not have to give out all, or even any, of your sandwiches to produce a minimized difference.
 * <p>
 * <p>
 * Another example: if arr is [4, 5, 2, 3, 1, 0] then you can distribute the sandwiches in the following order: [3, 0, 1, 0, 0]
 * which makes all the hunger levels the following: [2, 2, 2, 1, 0].
 *The differences between each pair of people is now: 0, 0, 1, 1 and so your program should return the final minimized
 * difference of 2.
 * <p>
 * Sample Test Cases
 * Input:5, 2, 3, 4, 5
 * Output:1
 * <p>
 * Input:3, 2, 1, 0, 4, 1, 0
 * Output:4
 * <p>
 * Created by George Fouche on 10/5/17.
 */
public class FoodDistribution {
    public int foodDistribution(int[] arr) {

        int totalFood = arr[0];
        int totalNumberHunger = 0;
        int[] numberOfHunger = new int[arr.length-1];
        for(int i=1;i<=arr.length-1;i++){
            numberOfHunger[i-1] = arr[i];
            totalNumberHunger += arr[i];
        }


        System.out.println("Total food: " + totalFood);
        System.out.print("Number of Hunger array: ");
        System.out.println(Arrays.toString(numberOfHunger));
        System.out.println("Total Number of Hunger: " + totalNumberHunger);

        if(totalFood > totalNumberHunger){
            return 0;
        }
        Arrays.sort(numberOfHunger);
        String repSmallNumber = "";
        for(int i=0;i<numberOfHunger.length-1;i++){
            if(numberOfHunger[i] == numberOfHunger[i+1]){
                repSmallNumber += "-"+numberOfHunger[i];
            }else{
                repSmallNumber += "-"+numberOfHunger[i];
            }
        }
        System.out.println("Replace small number: " + repSmallNumber);
        repSmallNumber = repSmallNumber.replace("-","");
        System.out.println("Replace small number: " + repSmallNumber);
        return 0;

    }

    public static int foodDistribution2(int[] arr) {
        int bestDiff = diff(arr);
        System.out.println(bestDiff);
        int sandwiches = arr[0];
        while (sandwiches > 0) {
            int nextDiff = Integer.MAX_VALUE;
            int nextIndex = -1;
            for (int i = 1; i < arr.length; i++) {
                arr[i]--;
                int diff = diff(arr);
                if (nextDiff > diff) {
                    nextDiff = diff;
                    nextIndex = i;
                }
                arr[i]++;
            }
            arr[nextIndex]--;
            if (bestDiff > nextDiff) bestDiff = nextDiff;
            sandwiches--;
        }
        return bestDiff;
    }

    public static int diff(int[] arr) {
        int diff = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int n1 = arr[i];
            int n2 = arr[i + 1];
            diff += (n1 > n2) ? (n1 - n2) : (n2 - n1);
        }
        return diff;
    }

    public static void main(String[] args) {
        FoodDistribution foodDistribution = new FoodDistribution();
        int[] array = {5, 3, 1, 2, 1};
        foodDistribution.foodDistribution2(array);
    }
}
