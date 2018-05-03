package CrackingTheCodingInterview;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Have a function which returns the total number of combination who's difference is k.
 * <p>
 * Created by fouli on 8/11/2017.
 */
public class NumberPairsDiff {

    public int countPairsWithDiffK(int[] input, int k) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            integerArrayList.add(input[i]);
        }
        Collections.sort(integerArrayList);
        System.out.println("Array: " +integerArrayList);

        int count = 0;
        int startPos = 0;
        int currentPos = 0;

        while (currentPos < integerArrayList.size()) {
            currentPos = startPos + 1;
            while (currentPos < integerArrayList.size()) {
                int diff = Math.abs(integerArrayList.get(currentPos) - integerArrayList.get(startPos));
                if (diff == k) {
                    System.out.println("Pair Found: " + integerArrayList.get(startPos) + " " + integerArrayList.get(currentPos));
                    count++;
                } else if (diff > k) {
                    break;
                }
                currentPos++;
            }
            startPos++;
        }
        return count;
    }

}
