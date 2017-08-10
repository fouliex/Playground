package datastructure.sorter;

/**
 * Created by George Fouche on 1/15/17.
 */
public class Sorter {
    private int[] theArray;

    public Sorter(int[] theArray) {
        this.theArray = theArray;
    }

    public int[] bubbleSort() {
        for (int x = theArray.length - 1; x >= 1; x--) {
            for (int y = 0; y < x; y++) {
                if (theArray[y] > theArray[y + 1]) {
                    swap(y, y + 1);
                }
            }
        }
        return theArray;
    }

    public int[] insertionSort() {
        for (int i = 1; i < theArray.length; i++) {
            int j = i;
            int toInsert = theArray[i];
            while ((j > 0) && (theArray[j - 1] > toInsert)) {
                theArray[j] = theArray[j - 1];
                j--;
            }
            theArray[j] = toInsert;
        }
        return theArray;
    }

    public int[]selectionSort(){
        for(int i = 0; i< theArray.length; i++){
            int minimum =i;
            for(int j = i; j< theArray.length; j++){
                if(theArray[minimum]> theArray[j]){
                    minimum =j;
                }
            }
            swap(i,minimum);
        }
        return theArray;
    }



    private void swap(int indexOne, int indexTwo) {
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }
}
