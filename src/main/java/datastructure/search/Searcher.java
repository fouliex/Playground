package datastructure.search;

/**
 * Created by George Fouche on 8/7/17.
 */
public class Searcher {
    private int[] theArray;
    private int arraySize;


    public Searcher(int arraySize) {
        this.arraySize = arraySize;
        theArray = new int[arraySize];
    }


    public String linearSearch(int value) {

        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                return i + " ";
            }
        }
        return "none";
    }


    public String binarySearch(int value) {
        int lowIndex = 0;
        int highIndex = arraySize - 1;
        int middleIndex = 0;

        while (lowIndex <= highIndex) {
            middleIndex = (highIndex + lowIndex) / 2;
            if (theArray[middleIndex] < value) {
                lowIndex = middleIndex + 1;
            } else if (theArray[middleIndex] > value) {
                highIndex = middleIndex - 1;
            } else {
                lowIndex = highIndex + 1;
            }

        }
        if (middleIndex == 0) {
            return "None";
        }
        return middleIndex + " ";

    }
}
