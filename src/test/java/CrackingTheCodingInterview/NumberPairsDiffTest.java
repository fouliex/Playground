package CrackingTheCodingInterview;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by fouli on 8/13/2017.
 */
@RunWith(Parameterized.class)
public class NumberPairsDiffTest {

    private int[] intArray;
    private int num;
    private int numberOfPairs;

    public NumberPairsDiffTest(String array, int num, int numberOfPairs) {
        String[] stringArray = array.split(",");
        this.intArray = convertStringArrayToIntArray(stringArray, stringArray.length);
        this.num = num;
        this.numberOfPairs = numberOfPairs;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"1,5,3,4,2", 3, 2},
                {"8,12,16,4,0,20", 4, 5}
        });
    }

    @Test
    public void test() {
        NumberPairsDiff numberPairsDiff = new NumberPairsDiff();
        assertEquals(numberOfPairs, numberPairsDiff.countPairsWithDiffK(intArray, num));
    }

    private int[] convertStringArrayToIntArray(String[] stringArray, int arraySize) {
        int[] data = new int[arraySize];
        for (int i = 0; i < stringArray.length; i++) {
            data[i] = Integer.parseInt(stringArray[i]);
        }
        return data;
    }

}