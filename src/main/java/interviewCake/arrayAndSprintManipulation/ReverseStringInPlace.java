package interviewCake.arrayAndSprintManipulation;

/**
 * Write a method that takes an array of characters and reverses the letters in place
 */
public class ReverseStringInPlace {

    private void reverse(char[] arrayOfChars) {
        int leftIndex = 0;
        int rightIndex = arrayOfChars.length-1;

        while(leftIndex < rightIndex){

            // swap characters
            char temp =arrayOfChars[leftIndex];
            arrayOfChars[leftIndex] =arrayOfChars[rightIndex];
            arrayOfChars[rightIndex]= temp;

            // move towards middle
            leftIndex++;
            rightIndex--;
        }

    }
    public static void main(String[] args) {
        ReverseStringInPlace reverseStringInPlace = new ReverseStringInPlace();
        char [] arrayofChars = "george".toCharArray();
        reverseStringInPlace.reverse(arrayofChars);
        System.out.println(arrayofChars);
    }


}
