package Recursion;

public class BinarySearch {

    private int[]array;


    public BinarySearch(int[] array) {
        this.array = array;
    }


    private int search(int item) {
        return binarySearch(0,this.array.length-1,item);
    }

    private int binarySearch(int startIndex, int endIndex, int item) {
        if(endIndex < startIndex){
            return -1;
        }

        int middleIndex = (startIndex + endIndex)/2;

        if(endIndex < startIndex){
            binarySearch(endIndex,startIndex,item);
        }
          if(item == this.array[middleIndex]){
            return  middleIndex;
          }else if(item < this.array[middleIndex]){
            return binarySearch(startIndex,middleIndex -1, item);
          }else{
            return binarySearch(middleIndex+1,endIndex,item);
          }
    }

    public static void main(String[] args) {
        int[] array = {1,5,6,8,13,22,26,40,50,57,60};

        BinarySearch bs= new BinarySearch(array);
        System.out.println(bs.search(5));
    }


}
