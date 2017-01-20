package sorter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by George Fouche on 1/17/17.
 */
@RunWith(Parameterized.class)
public class SorterTest {
    String unordered;
    String ordered;
    String[] stringArray;
    int[] data;

    public SorterTest(String unordered, String ordered) {
        this.unordered = unordered;
        this.ordered = ordered;
        this.stringArray = unordered.split(",");
        this.data = convertStringArrayToIntArray(stringArray,10);
    }

    @Parameters
    public static Collection<Object> data() {
        return Arrays.asList(new Object[][]{
                                            {"3,2,4,5,8,7,10,9,1,6,", "1,2,3,4,5,6,7,8,9,10,"},
                                            {"104,32,12,43,23,67,65,34,32,65,","12,23,32,32,34,43,65,65,67,104,"}
                                            });
    }

    @Test
    public void testBubbleSort() {
        Sorter sorter = new Sorter(data);
        data = sorter.bubbleSort();
        String[] stringArray = convertIntArrayToStringArray(data,10);
        assertEquals(ordered, convertStringArrayToString(stringArray));
    }

    @Test
    public void testInsertionSort(){
        Sorter sorter = new Sorter(data);
        data = sorter.insertionSort();
        String[] stringArrays =convertIntArrayToStringArray(data,10);
        assertEquals(ordered,convertStringArrayToString(stringArrays));
    }

    private int[] convertStringArrayToIntArray(String[] stringArray,int arraySize) {
        int[] data = new int[arraySize];
        for (int i = 0; i < stringArray.length; i++) {
            data[i] = Integer.parseInt(stringArray[i]);
        }
        return data;
    }

    private String[] convertIntArrayToStringArray(int[] intArray,int intArraySize){
        String [] stringArray = new String[intArraySize];
        for(int i = 0; i<intArray.length;i++){
            stringArray[i] = String.valueOf(intArray[i]);
        }
        return stringArray;
    }
    private String convertStringArrayToString(String[] stringArray){
        StringBuilder sb = new StringBuilder();
        for(String str : stringArray){
            sb.append(str + ",");
        }
        return  sb.toString();
    }
}