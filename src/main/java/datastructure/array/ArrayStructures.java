package datastructure.array;

/**
 * Created by George Fouche on 8/7/17.
 */
public class ArrayStructures {
    private int[] theArray = new int[50];
    private int arraySize = 10;

    public ArrayStructures() {

    }

    public ArrayStructures(int[] theArray, int arraySize) {
        this.theArray = theArray;
        this.arraySize = arraySize;
    }

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public int[] getTheArray() {
        return theArray;
    }


    public void insertValue(int value) {
        if (arraySize < 50) {
            theArray[arraySize] = value;
        }
        arraySize++;
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < arraySize - 1; i++) {
                theArray[i] = theArray[i + 1];
            }
            arraySize--;
        }
    }

    public int getValueAtIndex(int index) {
        if (index < arraySize) {
            return theArray[index];
        }
        return 0;
    }

    public boolean doesArrayContainThisValue(int searchValue) {
        boolean valueInArray = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == searchValue) {
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    public String linearSearch(int value) {

        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                return "Value " + value + " is as index: " + i;
            }
        }
        return "Value " + value + "does not exist";
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
            return "Value " + value + "does not exist";
        }
        return "Value " + value + " is as index: " + middleIndex;

    }

    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }

    public static void main(String[] args) {
        ArrayStructures arrays = new ArrayStructures();
        arrays.generateRandomArray();
        arrays.printArray();
        arrays.insertValue(25);
        arrays.printArray();

    }

}